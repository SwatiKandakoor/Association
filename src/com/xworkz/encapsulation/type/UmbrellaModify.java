package com.xworkz.encapsulation.type;

public class UmbrellaModify {

	public Umbrella umbrella;

	public void useUmbrella(Umbrella umbrella) {
		System.out.println(umbrella.getColours());
		umbrella.setColours("White");

		System.out.println(umbrella.getLength());
		umbrella.setLength(8);

		System.out.println(umbrella.getWidth());
		umbrella.setWidth(23);

		System.out.println(umbrella.getButtons());
		umbrella.setButtons(3);

		System.out.println(umbrella.isClose());
		umbrella.setClose(false);

		System.out.println(umbrella.getRibs());
		umbrella.setRibs(30);

		System.out.println(umbrella.getNylon());
		umbrella.setNylon("No");

		System.out.println(umbrella.isOpen());
		umbrella.setOpen(false);

		System.out.println(umbrella.getUnscrew());
		umbrella.setUnscrew(2);
	}

}
