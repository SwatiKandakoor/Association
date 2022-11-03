package com.xworkz.encapsulation.type;

public class CarModify {
	public Car car;

	public void useCar(Car car) {
		System.out.println(car.getName());
		car.setName("Toyota");

		System.out.println(car.getPrice());
		car.setPrice(500000d);

		System.out.println(car.getBrand());
		car.setBrand("Toyoto");

		System.out.println(car.getColor());
		car.setColor("White");

		System.out.println(car.getNoOfWheels());
		car.setNoOfWheels(4);

		System.out.println(car.getNoOfDoors());
		car.setNoOfDoors(6);

		System.out.println(car.isOld());
		car.setOld(true);
		
		System.out.println(car.getNoOfbreak());
		car.setNoOfbreak(1);
		
		System.out.println(car.getNoOfSeats());
		car.setNoOfSeats(6);
		
		System.out.println(car.getSeatCoverColor());
		car.setSeatCoverColor("White");

	}

}



