package com.myBeans;

public class Address {

	private String cityName;
	private long pincode;
	
	public Address() {}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", pincode=" + pincode + "]";
	}

}
