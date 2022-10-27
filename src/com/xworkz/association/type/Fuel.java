package com.xworkz.association.type;

import com.xworkz.association.constant.Type;

public class Fuel {

	public boolean special;
	public Type type = Type.DIESEL;
	public double price;
	public int quantity;
	
	public Brand brand = new Brand("Shell", 22000045d, 5);

	public Fuel(double price, int quantity) {
		this.price = price;
		this.quantity = quantity;

	}

	public void totalPrice() {
		double total = this.quantity * this.price;
		System.out.println("Total price of the Diesel = " +total);
		
	}

	public void specialise(boolean special) {
		this.special = special;
	}

	public void showOff() {
		System.out.println("Fuel Type :" + this.type);
		System.out.println("Special :" + this.special);
		System.out.println("Diesel Price :" + this.price);
		System.out.println("Diesel Quantity :" + this.quantity);
		
		if (this.brand != null) {
			this.brand.showOff();

		} else {
			System.out.println("Brand showOff is null");
		}
	}
}
