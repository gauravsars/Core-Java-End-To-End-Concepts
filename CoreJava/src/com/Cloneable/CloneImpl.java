package com.Cloneable;

import java.io.ObjectInputStream.GetField;

import com.bean.Address;
import com.bean.AddressCommonInfo;
import com.bean.Country;

public class CloneImpl {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		
		Country country = new Country("India", "IND");
		Country country2 = new Country("Russia", "RU");
		Address address = new Address("pimpri ",country,"MG Street","Pune");
		
		Address address1 = address.clone();
		
		address.setAddress("Address Changed");
		
		
		System.out.println("Address "+ address);
		System.out.println("Address1 "+address1);
		
		if (address==address1){
			System.out.println("Address found same refrence ");
		}
		
		if (address.getCountry()==address1.getCountry()){
			System.out.println(" Country found same refrence");
		}
	}
	

}
