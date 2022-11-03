package com.xworkz.encapsulation.boat;

import com.xworkz.encapsulation.type.ToothPaste;
import com.xworkz.encapsulation.type.ToothPasteModify;

public class ToothPasteRunner {
	public static void main(String[] args) {

		ToothPasteModify modify = new ToothPasteModify();
		ToothPaste toothPaste = new ToothPaste();

		modify.useTothPaste(toothPaste);
		System.out.println("After modifying Price:" + toothPaste.getPrice());

		System.out.println("After modifying Flavore :" + toothPaste.getFlavors());
		System.out.println("After modifying Water :" + toothPaste.getWater());
		System.out.println("After modifying Fluoride :" + toothPaste.getFluoride());
		System.out.println("After modifying Weight :" + toothPaste.getWeight());
		System.out.println("After modifying Clove :" + toothPaste.getClove());
		System.out.println("After modifying Neem :" + toothPaste.getNeem());
		System.out.println("After modifying Pudina :" + toothPaste.getPudina());
		System.out.println("After modifying Mint :" + toothPaste.getMint());
		System.out.println("After modifying Aloevera :" + toothPaste.getAloevera());
		System.out.println("After modifying Tulsi :" + toothPaste.getTulsi());

	}

}
