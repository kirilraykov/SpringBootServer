package hello;

public class Laptop {

	private String brand;
	private String model;
	private int price;
	private Feature feature;
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	
	public Laptop(String brand, String model, int price, Feature feature) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.feature = feature;
	}



	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public Feature getFeature() {
		return feature;
	}


	public void setFeature(Feature feature) {
		this.feature = feature;
	}
	
	
	
	
	
}
