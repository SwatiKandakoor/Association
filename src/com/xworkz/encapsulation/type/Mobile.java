package com.xworkz.encapsulation.type;

public class Mobile {
    private String name="Redmi 7pro";
    private String brand="MI";
    private double price=18000d;
    private int storage=64;
    public int simSlots=2;
    public int ram=8;
    public String color="Black";
    int warranty=2;
    String connectorType="C type";
    int sdCard=64;
    int batteryCapacity=6000;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getSimSlots() {
		return simSlots;
	}
	public void setSimSlots(int simSlots) {
		this.simSlots = simSlots;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public String getConnectorType() {
		return connectorType;
	}
	public void setConnectorType(String connectorType) {
		this.connectorType = connectorType;
	}
	public int getSdCard() {
		return sdCard;
	}
	public void setSdCard(int sdCard) {
		this.sdCard = sdCard;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
    
}
