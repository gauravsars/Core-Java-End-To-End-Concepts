package sorting.map.multipleAttributes;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class SortByMultipleValueAttributes {

    public static void main(String[] args) {

        Map<String, PlayerScore> unsortMap = new HashMap<String, PlayerScore>();
        unsortMap.put("Sachin", new PlayerScore(38,"a",24));
        unsortMap.put("Saurabh", new PlayerScore(24,"h",43));
        unsortMap.put("Bhumra", new PlayerScore(2,"v",24));
        unsortMap.put("Sehwag", new PlayerScore(34,"m",43));
        unsortMap.put("Rohit Sharma", new PlayerScore(43,"n",24));
        unsortMap.put("Virat Kohli", new PlayerScore(34,"b",43));
        unsortMap.put("ABD", new PlayerScore(24,"d",24));
        unsortMap.put("Shane Watson", new PlayerScore(24,"l",43));

        System.out.println("Unsort Map......");
        printMap(unsortMap);

        System.out.println("\nSorted Map......By Value");
        Map<String, PlayerScore> sortedMap = sortByValue(unsortMap);
        printMap(sortedMap);

    }

    private static Map<String, PlayerScore> sortByValue(Map<String, PlayerScore> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<String, PlayerScore>> list =
                new LinkedList<Map.Entry<String, PlayerScore>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        /*Collections.sort(list, new Comparator<Map.Entry<String, Score>>() {
            public int compare(Map.Entry<String, Score> o1,
                               Map.Entry<String, Score> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });*/
        
        Collections.sort(list, new ScoreComparator());

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, PlayerScore> sortedMap = new LinkedHashMap<String, PlayerScore>();
        for (Map.Entry<String, PlayerScore> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        /*
        //classic iterator example
        for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }*/


        return sortedMap;
    }

    public static <String, Score> void printMap(Map<String, Score> map) {
        for (Map.Entry<String, Score> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
            Score s = entry.getValue();
            System.out.println(((PlayerScore) s).getAge());
        }
    }

}