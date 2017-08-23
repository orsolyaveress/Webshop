package service;

public class AppliedDiscount {

	private int totalPrice;

	private int totalWithDiscount;

	private Discount appliedDiscount;

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getTotalWithDiscount() {
		return totalWithDiscount;
	}

	public void setTotalWithDiscount(int totalWithDiscount) {
		this.totalWithDiscount = totalWithDiscount;
	}

	public Discount getAppliedDiscount() {
		return appliedDiscount;
	}

	public void setAppliedDiscount(Discount appliedDiscount) {
		this.appliedDiscount = appliedDiscount;
	}

	@Override
	public String toString() {
		return "Total price: " + totalPrice + "\nTotal with discount: " + totalWithDiscount
				+ "\nApplied discount type: " + appliedDiscount.getNameOfDiscountType();
	}
	
	
}
