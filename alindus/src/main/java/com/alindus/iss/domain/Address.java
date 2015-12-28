package com.alindus.iss.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addresses")
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String address;
	private String address1;
	private String city;
	private String state;
	@Column(name = "zip_code")
	private String zipCode;
	private String country = "United State";

	public Address() {
	}

	public Address(String address, String city, String state, String zipCode) {
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", address1=" + address1 + ", city=" + city + ", state="
				+ state + ", zipCode=" + zipCode + ", country=" + country + "]";
	}

	public String toJson() {
		return "{\"id\":" + id + ", \"address\":\"" + address + "\", \"address1\":\" " + address1 + "\", \"city\":\""
				+ city + "\", \"state\":\"" + state + "\", \"zipCode\":\"" + zipCode + "\", \"country\":\"" + country
				+ "\"}";
	}

}
