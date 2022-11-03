package com.xworkz.encapsulation.type;

public class ToothPasteModify {
	public ToothPaste toothPaste;

	public void useTothPaste(ToothPaste toothPaste) {
		System.out.println("Price :"+toothPaste.getPrice());
		toothPaste.setPrice(89);

		System.out.println(toothPaste.getFlavors());
		toothPaste.setFlavors("CloseUp");

		System.out.println(toothPaste.getWater());
		toothPaste.setWater(10);

		System.out.println(toothPaste.getFluoride());
		toothPaste.setFluoride(null);

		System.out.println(toothPaste.getWeight());
		toothPaste.setWeight(500);

		System.out.println(toothPaste.getClove());
		toothPaste.setClove(10);

		System.out.println(toothPaste.getNeem());
		toothPaste.setNeem(40);

		System.out.println(toothPaste.getPudina());
		toothPaste.setPudina(1.56f);

		System.out.println(toothPaste.getMint());
		toothPaste.setMint(2.89f);

		System.out.println(toothPaste.getAloevera());
		toothPaste.setAloevera(30);

		System.out.println(toothPaste.getTulsi());
		toothPaste.setTulsi(37);
	}

}
