package service;

import java.util.HashMap;

import model.Product;

public abstract class Discount implements DiscountMethod{
	
	protected DiscountType discountType;
	
	protected Discount(DiscountType type) {
		this.discountType = type;
	}
	
	public String getNameOfDiscountType() {
		return discountType.getName();
	}

	public int totalDiscount(HashMap<Product, Integer> productList) {
		
			int totalPrice = 0;
			for (Product product : productList.keySet()) {
				totalPrice += discount(product, productList.get(product));
			}
			return totalPrice;	

	}
	
}
