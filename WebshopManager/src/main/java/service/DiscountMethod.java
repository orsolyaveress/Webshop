package service;

import java.util.HashMap;

import model.Product;

public interface DiscountMethod {

	public int discount(Product product, int quantity);
	
	public int totalDiscount(HashMap<Product, Integer> productList);
	
}
