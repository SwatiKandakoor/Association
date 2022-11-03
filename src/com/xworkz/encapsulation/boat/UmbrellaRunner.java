package com.xworkz.encapsulation.boat;

import com.xworkz.encapsulation.type.Umbrella;
import com.xworkz.encapsulation.type.UmbrellaModify;

public class UmbrellaRunner {
	public static void main(String[] args) {

		Umbrella umbrella = new Umbrella();
		UmbrellaModify modify = new UmbrellaModify();

		modify.useUmbrella(umbrella);
		System.out.println("After modifying :" + umbrella.getColours());
		System.out.println("After modifying :" + umbrella.getLength());
		System.out.println("After modifying :" + umbrella.getWidth());
		System.out.println("After modifying :" + umbrella.getButtons());
		System.out.println("After modifying :" + umbrella.isClose());

		System.out.println("After modifying :" + umbrella.getRibs());
		System.out.println("After modifying :" + umbrella.getNylon());
		System.out.println("After modifying :" + umbrella.isOpen());
		System.out.println("After modifying :" + umbrella.getUnscrew());
	}

}
