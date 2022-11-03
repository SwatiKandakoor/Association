package com.xworkz.encapsulation.type;

public class TyreModify {
	public Tyre tyre;
	public void useTyre(Tyre tyre) {
		System.out.println(tyre.getBrand());
		tyre.setBrand("Pirelli");
		
		System.out.println(tyre.getDaimeter());
		tyre.setDaimeter(25);
		
		System.out.println(tyre.getSize());
		tyre.setSize(4);
		
		System.out.println(tyre.getNumbers());
		tyre.setNumbers(34);
		
		System.out.println(tyre.getCircumference());
		tyre.setCircumference(5.36f);
		
		System.out.println(tyre.getSidewall());
		tyre.setSidewall(46);
		
		System.out.println(tyre.getWidth());
		tyre.setWidth(35);
		
		System.out.println(tyre.getWeight());
		tyre.setWeight(40);
		
	
	}

}
