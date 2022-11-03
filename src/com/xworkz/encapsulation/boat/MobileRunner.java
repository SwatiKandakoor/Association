package com.xworkz.encapsulation.boat;

import com.xworkz.encapsulation.type.Mobile;
import com.xworkz.encapsulation.type.MobileModify;

public class MobileRunner {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		MobileModify modify = new MobileModify();

		modify.useMobile(mobile);
		System.out.println("After modifying :" + mobile.getName());
		System.out.println("After modifying :" + mobile.getBrand());
		System.out.println("After modifying :" + mobile.getPrice());

		System.out.println("After modifying :" + mobile.getStorage());

		System.out.println("After modifying :" + mobile.getSimSlots());
		System.out.println("After modifying :" + mobile.getRam());
		System.out.println("After modifying :" + mobile.getColor());
		System.out.println("After modifying :" + mobile.getWarranty());
		System.out.println("After modifying :" + mobile.getConnectorType());
		System.out.println("After modifying :" + mobile.getSdCard());
		System.out.println("After modifying :" + mobile.getBatteryCapacity());

	}

}
