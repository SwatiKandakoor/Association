package com.xworkz.association.type;

public class Mountain {
	public String name;
	public Location location=new Location("Tirupati", "Tirupati","Andhra Pradesh",517101,"India");
	public int height;
	public Temple temple=new Temple("Sri Venkateswara Swami Temple","Venugopala Chari Dikshitulu",4800000d,75000d);
	
	
	public Mountain(String name,int height) {
		this.name=name;
		this.height=height;
	}
	public void showOff() {
		System.out.println("----Mountain ShowOff---------------");
		System.out.println("Mountain name :"+name);
		System.out.println("Mountain Height :"+height);
		System.out.println(System.lineSeparator());
		if(this.location!=null) {
			this.location.showOff();
		}
		else {
			System.out.println("Location showOff is null");
		}
		System.out.println(System.lineSeparator());
		if(this.temple!=null) {
			this.temple.showOff();
		}
		else {
			System.out.println("temple showOff is null");
		}
		
	}

}
