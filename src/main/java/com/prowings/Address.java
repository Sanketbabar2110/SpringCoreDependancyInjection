package com.prowings;

public class Address {
	
	int addressId;
	String city;
	
	public Address() {
		super();
	}
	
	public Address(int addressId, String city) {
		super();
		this.addressId = addressId;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + "]";
	}
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
