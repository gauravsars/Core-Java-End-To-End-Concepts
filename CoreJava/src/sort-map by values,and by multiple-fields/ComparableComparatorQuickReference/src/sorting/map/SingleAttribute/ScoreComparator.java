package sorting.map.SingleAttribute;

import java.util.Comparator;
import java.util.Map;


public class ScoreComparator implements Comparator<Map.Entry<String, PlayerScore> > {
	
	 public int compare(Map.Entry<String, PlayerScore> o1, Map.Entry<String, PlayerScore> o2) {
		 
		 int ageDifference = String.valueOf(o1.getValue().getAge()).compareTo(String.valueOf(o2.getValue().getAge()));
		 
			 return ageDifference;
		 
		 // if age is same for two player objects then compare runs.
		/* int runsDifference = String.valueOf(o1.getValue().getRuns()).compareTo(String.valueOf(o2.getValue().getRuns()));
		 
		  if(runsDifference!=0) {
			 
			 return runsDifference;
		 }
		  //if age as well as runs are same for the two objects then compare their names.
		  else
			  return (o1.getValue().getName().compareTo((o2.getValue().getName())));
	 }*/
	 
}
}
