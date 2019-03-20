package com.capgemini.model;

import java.util.Objects;

public class Television {
	String companyName;
	String type;
	boolean enabled3D;
	int price;
	
	public Television(String companyName, String type, boolean enabled3d, int price) {
		
		this.companyName = companyName;
		this.type = type;
		enabled3D = enabled3d;
		this.price = price;
	}
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isEnabled3D() {
		return enabled3D;
	}
	public void setEnabled3D(boolean enabled3d) {
		enabled3D = enabled3d;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(companyName , type ,price);

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Television))
			return false;
		if (this == obj)
			return true;
		Television l = (Television) obj;
		if (this.companyName == l.companyName && this.type == l.type && this.price ==l.price)
			return true;
		else
			return false;

	}

}
