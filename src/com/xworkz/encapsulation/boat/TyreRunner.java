package com.xworkz.encapsulation.boat;

import com.xworkz.encapsulation.type.Tyre;
import com.xworkz.encapsulation.type.TyreModify;

public class TyreRunner {
	public static void main(String[] args) {
		Tyre tyre = new Tyre();
		TyreModify modify = new TyreModify();
		modify.useTyre(tyre);
		System.out.println("After modifying :" + tyre.getBrand());

		System.out.println("After modifying :" + tyre.getDaimeter());
		System.out.println("After modifying :" + tyre.getSize());
		System.out.println("After modifying :" + tyre.getNumbers());
		System.out.println("After modifying :" + tyre.getCircumference());
		System.out.println("After modifying :" + tyre.getWidth());
		System.out.println("After modifying :" + tyre.getSidewall());
		System.out.println("After modifying :" + tyre.getWeight());

	}

}
