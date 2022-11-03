package com.xworkz.encapsulation.type;

public class BottleModify {
	public Bottle bottle;

	public void useBottle(Bottle bottle) {

		System.out.println(bottle.getType());
		bottle.setType("Steel");

		System.out.println(bottle.getPrice());
		bottle.setPrice(250);

		System.out.println(bottle.getQuantity());
		bottle.setQuantity(2);

		System.out.println(bottle.getQuality());
		bottle.setQuality("Very good quality");

		System.out.println(bottle.getLength());
		bottle.setLength(15);

		System.out.println(bottle.getShape());
		bottle.setShape("Square");

		System.out.println(bottle.getColor());
		bottle.setColor("Black");

		System.out.println(bottle.getWeigth());
		bottle.setWeigth(45);

		System.out.println(bottle.getBrand());
		bottle.setBrand("Hydro Flask");
	}

}
