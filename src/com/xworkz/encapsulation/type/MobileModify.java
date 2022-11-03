package com.xworkz.encapsulation.type;

public class MobileModify {

	public Mobile mobile;

	public void useMobile(Mobile mobile) {
		System.out.println(mobile.getName());
		mobile.setName("OnePlus Nord");

		System.out.println(mobile.getBrand());
		mobile.setBrand("OnePlus");

		System.out.println(mobile.getPrice());
		mobile.setPrice(40000d);

		System.out.println(mobile.getStorage());
		mobile.setStorage(128);

		System.out.println(mobile.getSimSlots());
		mobile.setSimSlots(1);

		System.out.println(mobile.getRam());
		mobile.setRam(64);

		System.out.println(mobile.getColor());
		mobile.setColor("Blue");

		System.out.println(mobile.getWarranty());
		mobile.setWarranty(1);

		System.out.println(mobile.getConnectorType());
		mobile.setConnectorType("C type");

		System.out.println(mobile.getSdCard());
		mobile.setSdCard(32);

		System.out.println(mobile.getBatteryCapacity());
		mobile.setBatteryCapacity(65000);
	}

}
