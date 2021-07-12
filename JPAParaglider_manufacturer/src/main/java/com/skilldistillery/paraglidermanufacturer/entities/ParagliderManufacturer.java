package com.skilldistillery.paraglidermanufacturer.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manufacturer")
public class ParagliderManufacturer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="company_name")
	private String companyName;

	private String country;
	
	@Column(name="year_founded")
	private int yearFounded;
	
	private String description;
	
	private String url;
	
	public ParagliderManufacturer() {	}

//	public ParagliderManufacturer(String companyName, String country, int yearFounded, String description, String url) {
//		super();
//		this.companyName = companyName;
//		this.country = country;
//		this.yearFounded = yearFounded;
//		this.description = description;
//		this.url = url;
//	}

	public int getId() {
		return id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getYearFounded() {
		return yearFounded;
	}

	public void setYearFounded(int yearFounded) {
		this.yearFounded = yearFounded;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "ParagliderManufacturer [id=" + id + ", companyName=" + companyName + ", country=" + country
				+ ", yearFounded=" + yearFounded + ", description=" + description + ", url=" + url + "]";
	}
	
	
	
}
