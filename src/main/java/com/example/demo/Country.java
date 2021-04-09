package com.example.demo;

public class Country {
	
	private String countryName;
	private String capital;
	
	public Country(String countryName,String capital) {
		this.countryName=countryName;
		this.capital=capital;
	}
	
	public String getcountryName() {
		return countryName;
	}
	public void setcountryName(String name) {
		this.countryName = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
}
