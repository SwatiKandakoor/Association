package com.xworkz.association.type;

public class Temple {
	public String name;
	public God god = new God("Venkateswara Swami", 'M', "Southern Power");
	public String mainPriest;
	public double noOfVisitors;
	public double collectionPerDay;

	public Temple(String name, String mainPriest, double noOfVisitors, double collectionPerDay) {
		this.name = name;
		this.mainPriest = mainPriest;
		this.noOfVisitors = noOfVisitors;
		this.collectionPerDay = collectionPerDay;

	}

	public void showOff() {
		System.out.println("-----Temple ShowOff---------------");
		System.out.println("Temple name :" + this.name);
		System.out.println("Temple main Priest :" + this.mainPriest);
		System.out.println("Temple no Of Visitors :" + this.noOfVisitors);
		System.out.println("Temple collection Per Day :" + this.collectionPerDay);
		System.out.println(System.lineSeparator());
		if (this.god != null) {
			this.god.showOff();
		} else {
			System.out.println("god showOff is null");
		}
	}

}
