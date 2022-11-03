package com.xworkz.encapsulation.type;

public class Car {
	private String name = "HondaCar";
	private double price = 300000d;
	private String brand = "Benz";
	public String color = "Black";
	public int noOfWheels = 4;
	public int noOfDoors = 5;
	boolean old = true;
	int noOfbreak = 1;
	int noOfSeats = 4;
	String seatCoverColor = "Red";

	public int getNoOfbreak() {
		return noOfbreak;
	}

	public void setNoOfbreak(int noOfbreak) {
		this.noOfbreak = noOfbreak;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getSeatCoverColor() {
		return seatCoverColor;
	}

	public void setSeatCoverColor(String seatCoverColor) {
		this.seatCoverColor = seatCoverColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public boolean isOld() {
		return old;
	}

	public void setOld(boolean old) {
		this.old = old;
	}

}
