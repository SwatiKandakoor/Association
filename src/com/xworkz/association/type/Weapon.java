package com.xworkz.association.type;

public class Weapon {
	public String name;
	public boolean use;
	public int weight;
	
	public Weapon(String name, boolean use, int weight) {
		super();
		this.name = name;
		this.use = use;
		this.weight = weight;
	}
	
	public void showOff() {
		System.out.println("-----Weapon ShowOff---------------");
		System.out.println("Weapon name :"+this.name);
		System.out.println("Weapon use :"+this.use);
		System.out.println("Weapon weight :"+this.weight);
	}

}
