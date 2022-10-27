package com.xworkz.association.type;

public class Brand {
	public String name;
	public double gstNo;
	public Location location=new Location("8th Cross ilkal", "ilkal", "Karnataka", 563852, "India");
	public int rating;
	
	public Brand(String name, double gstNo, int rating) {
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.rating = rating;
	}
	
	public void showOff() {
		System.out.println(System.lineSeparator());
		System.out.println("-----Brand showOff method----");
		System.out.println("Brand name  :"+this.name);
		System.out.println("Brand gstNo :"+this.gstNo);
		System.out.println("Brand rating :"+this.rating);
		System.out.println(System.lineSeparator());
		if (this.location!=null) {
			this.location.showOff();
			}
		else {
			System.out.println("Location showOff is null");
		}
	}
	
	
	

}
