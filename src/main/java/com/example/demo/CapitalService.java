package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CapitalService {
	
	private List<Country> countryList = new ArrayList<>(Arrays.asList(
            new Country("USA", "Washington"),
            new Country("India", "Delhi"),
            new Country("Australia", "Canberra"),
            new Country("Canada", "Toronto")

    ));
	
	public Country getCapital(String name) {
		return (Country) countryList.stream().filter(capital->capital.getcountryName().equals(name)).findAny().get();
	}
}
