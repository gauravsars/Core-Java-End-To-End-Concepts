package com.TreeSetCollectionSort;

import java.util.Comparator;

import com.bean.Employee;
import com.bean.Student;

public class FirstNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int i = o1.getLastName().compareTo(o2.getLastName());
		if (i==0)
			i=o1.getFirstName().compareTo(o2.getFirstName());
		return i;
	}

}
