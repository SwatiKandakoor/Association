package com.xworkz.encapsulation.type;

public class Kitchen {
	
	private String vegetableName="Onion";
	private String fruitName="Mango";
	public int noOfspoon=8;
	public int noOfPlates=20;
	public int kitchenArea=2000;
	int noOfGlasses=25;
	boolean clean=true;
	public String getVegetableName() {
		return vegetableName;
	}
	public void setVegetableName(String vegetableName) {
		this.vegetableName = vegetableName;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getNoOfspoon() {
		return noOfspoon;
	}
	public void setNoOfspoon(int noOfspoon) {
		this.noOfspoon = noOfspoon;
	}
	public int getNoOfPlates() {
		return noOfPlates;
	}
	public void setNoOfPlates(int noOfPlates) {
		this.noOfPlates = noOfPlates;
	}
	public int getKitchenArea() {
		return kitchenArea;
	}
	public void setKitchenArea(int kitchenArea) {
		this.kitchenArea = kitchenArea;
	}
	public int getNoOfGlasses() {
		return noOfGlasses;
	}
	public void setNoOfGlasses(int noOfGlasses) {
		this.noOfGlasses = noOfGlasses;
	}
	public boolean isClean() {
		return clean;
	}
	public void setClean(boolean clean) {
		this.clean = clean;
	}
	
	

}
