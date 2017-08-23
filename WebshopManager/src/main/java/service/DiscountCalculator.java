package service;

import java.util.HashMap;
import model.Product;

public interface DiscountCalculator {

	public AppliedDiscount calculate(HashMap<Product, Integer> productList); 
	
}
