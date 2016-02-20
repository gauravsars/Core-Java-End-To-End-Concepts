package com.bean;

import java.io.Serializable;

public class Country implements Cloneable ,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String countryName;
	private String countryCode;
	
	
	/**
	 * @param countryName
	 * @param countryCode
	 */
	public Country(String countryName, String countryCode) {
		super();
		this.countryName = countryName;
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	protected Country clone() throws CloneNotSupportedException{
		return (Country)super.clone();
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", countryCode="
				+ countryCode + ", getCountryName()=" + getCountryName()
				+ ", getCountryCode()=" + getCountryCode() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result
				+ ((countryName == null) ? 0 : countryName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		return true;
	}
	
}
