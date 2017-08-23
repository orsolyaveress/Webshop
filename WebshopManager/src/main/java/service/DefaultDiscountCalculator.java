package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import model.Product;

public class DefaultDiscountCalculator implements DiscountCalculator {
	
	private List<Discount> discountList = new ArrayList<>();
	
	// other solution 
//	{
//		System.out.println("Hello");
//	}
	
	public DefaultDiscountCalculator(){
		discountList.add(new ThreeForTwo());
		discountList.add(new Megapack());
	}

	@Override
	public AppliedDiscount calculate(HashMap<Product, Integer> productList) {
		
		AppliedDiscount appliedDiscount = new AppliedDiscount();
		int discountValue = 0;
		int totalPrice = calculateTotalPrice(productList);
		appliedDiscount.setTotalPrice(totalPrice);
		
		for (Discount discount : discountList) {
			int actualDiscountValue = discount.totalDiscount(productList);
			if (actualDiscountValue>discountValue) {
				discountValue = actualDiscountValue;
				appliedDiscount.setAppliedDiscount(discount);
				appliedDiscount.setTotalWithDiscount(totalPrice - discountValue);	
			}	
		}
		return appliedDiscount;
	}
	
	private int calculateTotalPrice(HashMap<Product, Integer> productList) {
		int totalPrice = 0;
		for (Product product : productList.keySet()) {
			totalPrice += product.getPrice()*productList.get(product);
		}
		return totalPrice;	
	}
}
