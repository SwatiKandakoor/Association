package com.xworkz.association.type;

public class Company {
	public String name;
	public String type;

	public Company(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public void showOff() {
		System.out.println("company showOff method-----");
		System.out.println("Company :" + this.name);
		System.out.println("company type :" + this.type);
	}
}
