package com.reflectionAPI;

import com.bean.Address;

public class InstantiateObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
		Class address = 	Class.forName("com.bean.Address");
		System.out.println(address);
		Address addresss = (Address)address.newInstance();
		addresss.setAddress("asddsdf");
		System.out.println(addresss.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
