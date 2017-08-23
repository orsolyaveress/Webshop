package service;

public enum DiscountType {
	
	THREE_FOR_TWO("Three for two"), MEGAPACK("Megapack");
	
	private String name;

	private DiscountType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	
}
