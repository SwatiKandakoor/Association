package com.xworkz.encapsulation.type;

public class Tyre {
	public String brand = "Michelin ";
	public int daimeter = 20;
	private int size = 4;
	private int numbers = 45;
	float circumference = 5.76f;
	int sidewall = 14;
	int width = 7;
	int weight = 25;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getDaimeter() {
		return daimeter;
	}

	public void setDaimeter(int daimeter) {
		this.daimeter = daimeter;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	public float getCircumference() {
		return circumference;
	}

	public void setCircumference(float circumference) {
		this.circumference = circumference;
	}

	public int getSidewall() {
		return sidewall;
	}

	public void setSidewall(int sidewall) {
		this.sidewall = sidewall;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
