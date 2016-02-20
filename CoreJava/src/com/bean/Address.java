package com.bean;

import java.io.Serializable;

public class Address extends AddressCommonInfo{
public String address;
public Country country;

/**
 * @param address
 */
public Address(String address,Country country,String streetName, String city) {
	super();
	this.address = address;
	this.country=country;
	this.setStreetName(streetName);
	this.setCity(city);
}

/**
 * 
 */
public Address() {
	
	super();
	System.out.println("Defoult Counstructor");
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;

	
}

public Country getCountry() {
	return country;
}

public void setCountry(Country country) {
	this.country = country;
}

/*public Address getAddressBean() throws CloneNotSupportedException{
	return (Address) this.clone();
}*/


@Override
public Address clone() throws CloneNotSupportedException{
	Address address = (Address) super.clone();
	address.country = (Country)country.clone();
	return address;
}

@Override
public String toString() {
	return "Address [address=" + address + ", country=" + country
			+ ", getAddress()=" + getAddress() + ", getCountry()="
			+ getCountry() + ", getStreetName()=" + getStreetName()
			+ ", getCity()=" + getCity() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
}


}
