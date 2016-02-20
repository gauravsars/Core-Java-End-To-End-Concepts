package com.bean;

import java.io.Serializable;

public class AddressCommonInfo implements Serializable,Cloneable {

	private String streetName;
	private String city;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
