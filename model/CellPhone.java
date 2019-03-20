package com.capgemini.model;

import java.util.Objects;

public class CellPhone {

	String companyName;
	String modelName;
	String decription;
	String description;
	double price;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CellPhone(String companyName, String modelName, String decription, String description, double price) {
		super();
		this.companyName = companyName;
		this.modelName = modelName;
		this.decription = decription;
		this.description = description;
		this.price = price;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(companyName,modelName,decription);

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof CellPhone))
			return false;
		if (this == obj)
			return true;
		CellPhone l = (CellPhone) obj;
		if (this.companyName== l.companyName && this.modelName == l.modelName && this.description==l.decription) 
			return true;
		else
			return false;

	}

}
