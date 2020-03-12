package com.practice.spring.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstname;
	private String lastname;
	private String country;
	private LinkedHashMap<String, String> countriesList;
	private String favlang;
	private String [] operatingSystems;
	
	public Student() {
		countriesList = new LinkedHashMap<String, String>();
		countriesList.put("IN", "India");
		countriesList.put("BR", "Brazil");
		countriesList.put("FR", "France");
		countriesList.put("GM", "Germany");
		countriesList.put("US", "United States");
	}
	
	public LinkedHashMap<String, String> getCountriesList() {
		return countriesList;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFavlang() {
		return favlang;
	}

	public void setFavlang(String favlang) {
		this.favlang = favlang;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	

}
