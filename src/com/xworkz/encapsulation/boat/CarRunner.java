package com.xworkz.encapsulation.boat;

import com.xworkz.encapsulation.type.Car;
import com.xworkz.encapsulation.type.CarModify;

public class CarRunner {

	public static void main(String[] args) {

		Car car = new Car();
		CarModify modify = new CarModify();
		modify.useCar(car);
		System.out.println("After modifying :" + car.getName());
		System.out.println("After modifying :" + car.getPrice());
		System.out.println("After modifying :" + car.getBrand());
		System.out.println("After modifying :" + car.getColor());
		System.out.println("After modifying :" + car.getNoOfWheels());
		System.out.println("After modifying :" + car.getNoOfDoors());
		System.out.println("After modifying :" + car.isOld());
		System.out.println("After modifying :" + car.getNoOfbreak());
		System.out.println("After modifying :" + car.getNoOfSeats());

		System.out.println("After modifying :" + car.getSeatCoverColor());

	}

}
