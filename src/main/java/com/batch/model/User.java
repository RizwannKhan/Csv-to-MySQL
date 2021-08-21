package com.batch.model;

public class User {

	private Long empId;
	private String firstName;
	private String lastName;
	private String companyName;
	private String address;
	private String country;
	private String city;
	private String email;

	public User() {

	}

	public User(Long empId, String firstName, String lastName, String companyName, String address, String country,
			String city, String email) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.address = address;
		this.country = country;
		this.city = city;
		this.email = email;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
