package com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Add_Remove_Data {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashSet<Integer> lh= new LinkedHashSet<Integer>();
		HashSet<Integer> hs= new HashSet<Integer>();
		
		for (int i=-3;i<3;i++){
			lh.add(i);
			hs.add(i);
		}
		
		System.out.println(lh+" :: "+hs);
		
		for(int i=0;i<3;i++){
			lh.remove(i);
			hs.remove(i);
		}
		
		System.out.println(lh+" :: "+hs);
		
		HashMap<String, String> map = new HashMap<>();
		map.put("A", "a");
		map.put("A","b");
		map.put("A","c");
		System.out.println(map);
		
		HashSet set = new HashSet<String>();
		set.add("A");
		set.add("A");
		set.add("A1");
		System.out.println(set);
		
		
		Student student = new Student(1,"Sachin","Computer");
		Student student2 = new Student(2, "Sachin", "Computer");
		Student student3 = new Student(3, "Pallavi", "Management");
		 Student student4= new Student(4, "Prajwal", "Operating Sys");
		
		HashSet<Student> hashSet = new HashSet<>();
	
		
		hashSet.add(student);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);
		
		for (Student student5 : hashSet) {
			
			System.out.println(student5);
			
		}
		
		
		
		
		
	}

}
