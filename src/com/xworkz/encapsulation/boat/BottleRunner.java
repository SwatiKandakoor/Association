package com.xworkz.encapsulation.boat;

import com.xworkz.encapsulation.type.Bottle;
import com.xworkz.encapsulation.type.BottleModify;

public class BottleRunner {

	public static void main(String[] args) {
		Bottle bottle = new Bottle();
		BottleModify modify = new BottleModify();

		modify.useBottle(bottle);

		System.out.println("After modifying :" + bottle.getType());
		System.out.println("After modifying :" + bottle.getPrice());
		System.out.println("After modifying :" + bottle.getQuantity());
		System.out.println("After modifying :" + bottle.getQuality());
		System.out.println("After modifying :" + bottle.getLength());
		System.out.println("After modifying :" + bottle.getShape());
		System.out.println("After modifying :" + bottle.getColor());
		System.out.println("After modifying :" + bottle.getWeigth());
		System.out.println("After modifying :" + bottle.getBrand());

	}

}
