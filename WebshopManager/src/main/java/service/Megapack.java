package service;

import model.Product;

public class Megapack extends Discount{

	public Megapack() {
		super(DiscountType.MEGAPACK);

	}

	public int discount(Product product, int quantity) {
		if (product.isMegapack()){
			return (quantity/12)*6000;
		}
		return 0;	
	}


	

}
