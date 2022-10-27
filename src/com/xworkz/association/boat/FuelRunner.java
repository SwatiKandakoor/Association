package com.xworkz.association.boat;

import com.xworkz.association.type.Fuel;

public class FuelRunner {

	public static void main(String[] args) {
		Fuel fuel = new Fuel(87, 10);
		fuel.specialise(true);
		fuel.showOff();
		System.out.println(System.lineSeparator());
		fuel.totalPrice();
	}

}
