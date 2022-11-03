package com.xworkz.encapsulation.type;

public class ProductModify {

	public Product product;

	public void useProduct(Product product) {
		System.out.println(product.getName());
		product.setName("Water Bottle");

		System.out.println(product.getType());
		product.setType("Steel");

		System.out.println(product.getPrice());
		product.setPrice(250);

		System.out.println(product.getQuantity());
		product.setQuantity(2);

		System.out.println(product.getQuality());
		product.setQuality("Very good quality");

		System.out.println(product.getLength());
		product.setLength(15);

		System.out.println(product.getShape());
		product.setShape("Square");

		System.out.println(product.getColor());
		product.setColor("Black");

		System.out.println(product.getWeigth());
		product.setWeigth(45);

		System.out.println(product.getBrand());
		product.setBrand("Hydro Flask");
	}

}
