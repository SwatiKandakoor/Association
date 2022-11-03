package com.xworkz.encapsulation.boat;

import com.xworkz.encapsulation.type.Vehicle;
import com.xworkz.encapsulation.type.VehicleModify;

public class VehicleRunner {
	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		VehicleModify modify = new VehicleModify();
		modify.useVehicle(vehicle);
		System.out.println("After modifying :" + vehicle.getName());
		System.out.println("After modifying :" + vehicle.getPrice());
		System.out.println("After modifying :" + vehicle.getBrand());
		System.out.println("After modifying :" + vehicle.getColor());
		System.out.println("After modifying :" + vehicle.getNoOfWheels());
		System.out.println("After modifying :" + vehicle.getNoOfDoors());
		System.out.println("After modifying :" + vehicle.isOld());
		System.out.println("After modifying :" + vehicle.getNoOfbreak());
		System.out.println("After modifying :" + vehicle.getNoOfSeats());

		System.out.println("After modifying :" + vehicle.getSeatCoverColor());

	}

}
