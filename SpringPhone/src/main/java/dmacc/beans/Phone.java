package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Phone {

	private String brand;
	private String model;
	private String provider;
	private String number;
	
	public Phone() {
		super();
	}

	public Phone(String brand, String model, String provider, String number) {
		super();
		this.brand = brand;
		this.model = model;
		this.provider = provider;
		this.number = number;
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

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", model=" + model + ", provider=" + provider + ", number=" + number + "]";
	}
	
	
}
