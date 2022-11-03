package com.xworkz.encapsulation.type;

public class ChairModify {
	public Chairs chair;

	public void useChairs(Chairs chair) {

		System.out.println(chair.getProductType());
		chair.setType("Wood");

		System.out.println(chair.getPrice());
		chair.setPrice(1000);

		System.out.println(chair.getQuantity());
		chair.setQuantity(3);

		System.out.println(chair.getQuality());
		chair.setQuality("Very good quality");

		System.out.println(chair.getLength());
		chair.setLength(27);

		System.out.println(chair.getNoOfLegs());
		chair.setNoOfLegs(4);
		

		System.out.println(chair.getColor());
		chair.setColor("Black");

		System.out.println(chair.getWeigth());
		chair.setWeigth(45);

		System.out.println(chair.getBrand());
		chair.setBrand("Hydro Flask");

		System.out.println(chair.getType());
		chair.setType("Slpeeing Chair");
	}

}
