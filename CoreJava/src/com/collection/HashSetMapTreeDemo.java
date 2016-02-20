package com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Test;


class AnyObj{

	@Override
	public String toString() {
		return "AnyObj [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

public class HashSetMapTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet hs= new HashSet();
		hs.add("A");
		hs.add("B");
		hs.add("a");
		hs.add("b");
		hs.add(new AnyObj());
		
		System.out.println(hs);
		
		HashMap hm = new HashMap();
		hm.put("B","B");
		hm.put("a", "a");
		hm.put("A", "A");
		hm.put("1", "1");
		hm.put("!", "!");
		hm.put("X", "X");
		hm.put("x", "x");
		hm.put("C", "c");
		hm.put(new AnyObj(), 1234);
		
		System.out.println(hm);
		System.out.println(hm.get("A"));
		
		Iterator it = hm.entrySet().iterator();
		while(it.hasNext()){
		System.out.println(it.next());	
		}
		
		hm.put("0", "0");
		hm.put("2", "2");
		
		System.out.println("------------------------------------");
		it = hm.entrySet().iterator();
		while(it.hasNext()){
		System.out.println(it.next());	
		}
		
		
		
	    TreeSet tset= new TreeSet();
	    tset.add(new AnyObj());
	   // tset.add(new Integer(6));
	   // tset.add(new String("britain"));
	    
	    //tset.add("india");

	   // tset.add("checksolvakia");
	   // tset.add("china");
	   // tset.add("sri_lanka");
	   // tset.add("zimbabwe");

	    System.out.println(tset);
	    
	    
	   // for(String str:tset){
	  //      System.out.println(str);
	  //  }
		
	    int paramInt1=10;
	    int paramInt2=20;
	    
		System.out.println(paramInt1 & paramInt2);
		
		
	}

}
