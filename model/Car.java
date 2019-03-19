package com.capgemini.model;

import java.util.Objects;

public class Car {

	private String make;
	private String modelName;
	private int yearManufactured;
	private int price;

	public Car(String make, String modelName, int yearManufactured, int price) {
	
		this.make = make;
		this.modelName = modelName;
		this.yearManufactured = yearManufactured;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getYearManufactured() {
		return yearManufactured;
	}

	public void setYearManufactured(int yearManufactured) {
		this.yearManufactured = yearManufactured;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(make , modelName,yearManufactured,price );

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Car))
			return false;
		if (this == obj)
			return true;
		Car l = (Car) obj;
		if (this.make == l.make && this.modelName == l.modelName)
			return true;
		else
			return false;

	}

}
