package com.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindMinimumNumber {

	public static void main(String are[]) {

		Scanner in = new Scanner(System.in);

		System.out.println(" Enter 10 Values ");

		int i = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		while (i < 10) {
			System.out.println("Enter Value for " + i + ":: ");
			map.put(i, in.nextInt());
			i++;
		}

		HashMap<Integer, Integer> hmap = sortHasMapByValue(map);

		System.out.println("This NUmber will not generate " + findNumber(map));
		System.out.println("Time Number wil not generate (Sort)");
		findNumberFromSort2(hmap);

		/*
		 * System.out.println("After Sorting:"); Set set2 = hmap.entrySet();
		 * Iterator iterator2 = set2.iterator(); while (iterator2.hasNext()) {
		 * Map.Entry me2 = (Map.Entry) iterator2.next();
		 * System.out.print(me2.getKey() + ": ");
		 * System.out.println(me2.getValue()); }
		 * 
		 * Iterator iterator3 = set2.iterator(); while (iterator3.hasNext()) {
		 * Map.Entry me2 = (Map.Entry) iterator3.next();
		 * 
		 * boolean result = isDigitPresentInNumber(me2.getKey(),
		 * me2.getValue()); System.out.println(result);
		 * System.out.print(me2.getKey() + ": ");
		 * System.out.println(me2.getValue()); }
		 */}

	private static void findNumberFromSort(HashMap<Integer, Integer> hmap) {

		Set set2 = hmap.entrySet();
		double number = 0;
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator2.next();

			int value = Integer.parseInt(me2.getValue().toString());
			int key = Integer.parseInt(me2.getKey().toString());
			if (iterator2.hasNext()) {
				Map.Entry me3 = (Map.Entry) iterator2.next();
				int value1 = Integer.parseInt(me3.getValue().toString());
				int key1 = Integer.parseInt(me3.getKey().toString());
				if (value < value1 && key == 0) {
					System.out.print(me3.getKey().toString());
					value = value1 + 1;
				} else {
					if (key1 != 0)
						me2 = me3;
					value++;
					value++;
				}
			}
			for (int j = 0; j < value - 1; j++) {

				System.out.print(me2.getKey().toString());
			}
			break;
		}

	}

	private static void findNumberFromSort2(HashMap<Integer, Integer> hmap) {

		Set set = hmap.entrySet();
		double number = 0;
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			int value = Integer.parseInt(me.getValue().toString());
			int key = Integer.parseInt(me.getKey().toString());
			if (key == 0) {
				if (iterator.hasNext()) {
					Map.Entry me1 = (Map.Entry) iterator.next();
					int value1 = Integer.parseInt(me1.getValue().toString());
					int key1 = Integer.parseInt(me1.getKey().toString());
					if (value1 == value) {
						for (int i = 0; i <= value1; i++)
							System.out.print(key1);
					} else {
						System.out.print(1);
						for (int i = 0; i <= value; i++)
							System.out.print(key);
					}
				}
				break;
			} else {
				if (iterator.hasNext()) {
					Map.Entry me1 = (Map.Entry) iterator.next();
					int value1 = Integer.parseInt(me1.getValue().toString());
					int key1 = Integer.parseInt(me1.getKey().toString());
					if (value1 == value) {
						for (int i = 0; i <= value1; i++)
							System.out.print(key);
					} else {
						//System.out.print(1);
						for (int i = 0; i <= value; i++)
							System.out.print(key);
					}
				}
				break;
			}
		}

	}

	private static double findNumber(HashMap map) {

		boolean result = false;
		double exactNumber = 0;
		for (double i = 0; i < Double.MAX_VALUE && result != true; i++) {

			String NumberStr = i + "";
			HashMap<Integer, Integer> tempMap = (HashMap<Integer, Integer>) map
					.clone();
			double i1 = i;
			while (i1 > 0) {
				int j = (int) (i1 % 10);
				/* System.out.print("Number "+j); */

				if (Integer.parseInt(tempMap.get(j) + "") > 0) {
					tempMap.put(j, Integer.parseInt(tempMap.get(j) + "") - 1);
				} else {
					result = true;
					exactNumber = i;
					break;
				}

				i1 = (int) (i1 / 10);
			}
		}
		return exactNumber;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static HashMap sortHasMapByValue(HashMap<Integer, Integer> hashmap) {
		List list = new LinkedList(hashmap.entrySet());
		// Defined Custom Comparator here
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue())
						.compareTo(((Map.Entry) (o2)).getValue());
			}
		});

		// Here I am copying the sorted list in HashMap
		// using LinkedHashMap to preserve the insertion order
		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}

}
