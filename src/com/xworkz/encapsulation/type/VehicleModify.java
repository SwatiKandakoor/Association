package com.xworkz.encapsulation.type;

public class VehicleModify {

	public Vehicle vehicle;

	public void useVehicle(Vehicle vehicle) {
		System.out.println(vehicle.getName());
		vehicle.setName("Bike");

		System.out.println(vehicle.getPrice());
		vehicle.setPrice(200000d);

		System.out.println(vehicle.getBrand());
		vehicle.setBrand("Royal Enfield");

		System.out.println(vehicle.getColor());
		vehicle.setColor("White");

		System.out.println(vehicle.getNoOfWheels());
		vehicle.setNoOfWheels(2);

		System.out.println(vehicle.getNoOfDoors());
		vehicle.setNoOfDoors(0);

		System.out.println(vehicle.isOld());
		vehicle.setOld(true);
		
		System.out.println(vehicle.getNoOfbreak());
		vehicle.setNoOfbreak(1);
		
		System.out.println(vehicle.getNoOfSeats());
		vehicle.setNoOfSeats(2);
		
		System.out.println(vehicle.getSeatCoverColor());
		vehicle.setSeatCoverColor("White");

	}

}
