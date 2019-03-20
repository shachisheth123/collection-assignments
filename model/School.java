package com.capgemini.model;

import java.util.Objects;

public class School {

	String name;
	String city;
	String schoolDistrict;
	String greatSchoolRanking;

	public School(String name, String city, String schoolDistrict, String greatSchoolRanking) {

		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}

	public String getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(String greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,city,schoolDistrict);

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof School))
			return false;
		if (this == obj)
			return true;
		School l = (School) obj;
		if (this.name== l.name && this.city == l.city && this.schoolDistrict==l.schoolDistrict) 
			return true;
		else
			return false;

	}

}
