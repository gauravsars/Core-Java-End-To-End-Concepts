package com.TreeSetCollectionSort;

import java.util.TreeMap;
import java.util.TreeSet;

import com.bean.Student;

public class TreeSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> students = new TreeSet<Student>(new FirstNameComparator());
		
		students.add(new Student("Sachin","Ghalme",1));
		students.add(new Student("Ram", "Ghalme", 2));
		students.add(new Student("Abhishek", "Lather", 3));
		students.add(new Student("Bacchan", "Abhi", 0));
		
		
		for(Student s:students){
			System.out.println(s);
		}
}

}
