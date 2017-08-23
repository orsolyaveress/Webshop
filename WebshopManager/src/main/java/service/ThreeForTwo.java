package service;

import model.Product;

public class ThreeForTwo extends Discount{
	
	public ThreeForTwo() {
		super(DiscountType.THREE_FOR_TWO);
	}

	public int discount(Product product, int quantity) {
		return product.getPrice()*(quantity/3);
	}	
	
}
