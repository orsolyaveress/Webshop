package model;

public class Product {

	private String name;
	
	private int price;
	
	private boolean megapack;
	
	public Product(String name, int price, boolean megapack) {
		super();
		this.name = name;
		this.price = price;
		this.megapack = megapack;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public boolean isMegapack() {
		return megapack;
	}

}
