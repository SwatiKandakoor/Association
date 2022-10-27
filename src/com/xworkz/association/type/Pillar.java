package com.xworkz.association.type;

import com.xworkz.association.constant.Shape;

public class Pillar {
	public int id;
	public String place;
	public Shape shape = Shape.CIRCULAR;
	public boolean supporting;
	public int height;
	public Company company = new Company("Bangalore", "civil");

	public Pillar(int id, String place, int height) {
		this.id = id;
		this.place = place;
		this.height = height;

	}

	public void support(boolean supporting) {
		this.supporting = supporting;
	}

	public void showOff() {

		System.out.println("Pillar Id :" + this.id);
		System.out.println("Place :" + this.place);
		System.out.println("shapes :" + this.shape);
		System.out.println("height :" + this.height);
		System.out.println("supporting :" + this.supporting);
		System.out.println(System.lineSeparator());
		if (this.company != null) {
			this.company.showOff();
		} else {
			System.out.println("Company showOff is null");
		}

	}
}