package com.xworkz.encapsulation.boat;

import com.xworkz.encapsulation.type.ChairModify;
import com.xworkz.encapsulation.type.Chairs;

public class ChairsRunner {

	public static void main(String[] args) {
		Chairs chair = new Chairs();
		ChairModify modify = new ChairModify();

		modify.useChairs(chair);

		System.out.println("After modifying :" + chair.getProductType());
		System.out.println("After modifying :" + chair.getPrice());
		System.out.println("After modifying :" + chair.getQuantity());
		System.out.println("After modifying :" + chair.getQuality());
		System.out.println("After modifying :" + chair.getLength());
		System.out.println("After modifying :" + chair.getNoOfLegs());
		System.out.println("After modifying :" + chair.getColor());
		System.out.println("After modifying :" + chair.getWeigth());
		System.out.println("After modifying :" + chair.getBrand());
		System.out.println("After modifying :" + chair.getType());

	}

}
