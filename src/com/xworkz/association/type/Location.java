package com.xworkz.association.type;

public class Location {
	public String street;
	public String city;
	public String state;
	public int pincode;
	public String country;

	public Location(String street, String city, String state, int pincode, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
	}

	public void showOff() {
		System.out.println("-----Location ShowOff---------------");
		System.out.println("Location street :" + this.street);
		System.out.println("Location city :" + this.city);
		System.out.println("Location state :" + this.state);
		System.out.println("Location pincode :" + this.pincode);
		System.out.println("Location country :" + this.country);
	}

}
