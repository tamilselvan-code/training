package com.core.java.session;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {

		Product product_one = new Product();
		product_one.setName("Soap");
		product_one.setPrice(10);

		Product product_two = new Product();
		product_two.setName("Soap");
		product_two.setPrice(20);

		Product product_three = new Product();
		product_three.setName("Seepu");
		product_three.setPrice(30);

		Product product_four = new Product();
		product_four.setName("Seepu");
		product_four.setPrice(40);

		Product product_five = new Product();
		product_five.setName("Kannaadi");
		product_five.setPrice(50);

		Product product_six = new Product();
		product_six.setName("Kannaadi");
		product_six.setPrice(60);

		List<Product> products = new ArrayList<Product>();

		products.add(product_one);
		products.add(product_two);
		products.add(product_three);
		products.add(product_four);
		products.add(product_five);
		products.add(product_six);

		Map<String, List<Product>> result = products.stream().collect(Collectors.groupingBy(Product::getName));
		System.out.println(result);

	}

}
