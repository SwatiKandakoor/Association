package com.xworkz.encapsulation.boat;

import com.xworkz.encapsulation.type.Product;
import com.xworkz.encapsulation.type.ProductModify;

public class ProductRunner {

	public static void main(String[] args) {
		Product product = new Product();
		ProductModify modify = new ProductModify();

		modify.useProduct(product);
		System.out.println("After modifying :" + product.getName());
		System.out.println("After modifying :" + product.getType());
		System.out.println("After modifying :" + product.getPrice());
		System.out.println("After modifying :" + product.getQuantity());
		System.out.println("After modifying :" + product.getQuality());
		System.out.println("After modifying :" + product.getLength());
		System.out.println("After modifying :" + product.getShape());
		System.out.println("After modifying :" + product.getColor());
		System.out.println("After modifying :" + product.getWeigth());
		System.out.println("After modifying :" + product.getBrand());
	}

}
