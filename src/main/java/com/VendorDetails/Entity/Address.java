package com.VendorDetails.Entity;

public class Address 
{
private String City;
private String State;
private String Country;
private String GSTN;
private int PinCode;

public Address(String city, String state, String country, String gSTN, int pinCode) {
	super();
	City = city;
	State = state;
	Country = country;
	GSTN = gSTN;
	PinCode = pinCode;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

public String getState() {
	return State;
}

public void setState(String state) {
	State = state;
}

public String getCountry() {
	return Country;
}

public void setCountry(String country) {
	Country = country;
}

public String getGSTN() {
	return GSTN;
}

public void setGSTN(String gSTN) {
	GSTN = gSTN;
}

public int getPinCode() {
	return PinCode;
}

public void setPinCode(int pinCode) {
	PinCode = pinCode;
}

@Override
public String toString() {
	return "Address [City=" + City + ", State=" + State + ", Country=" + Country + ", GSTN=" + GSTN + ", PinCode="
			+ PinCode + "]";
}


}