package com.capgemini.model;

import java.util.Objects;

public class Laptop {

	private String companyName;
	private String modelName;
	private String operatingSystem;
	private String processorName;

	public Laptop() {

	}

	public Laptop(String companyName, String modelName, String operatingSystem, String processorName) {
		super();
		this.companyName = companyName;
		this.modelName = modelName;
		this.operatingSystem = operatingSystem;
		this.processorName = processorName;
	}

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

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getProcessorName() {
		return processorName;
	}

	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(modelName , companyName );

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Laptop))
			return false;
		if (this == obj)
			return true;
		Laptop l = (Laptop) obj;
		if (this.companyName == l.companyName && this.modelName == l.modelName)
			return true;
		else
			return false;

	}

}
