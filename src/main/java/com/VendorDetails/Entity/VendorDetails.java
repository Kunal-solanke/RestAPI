package com.VendorDetails.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class VendorDetails 
{
	
	
@Id
private int VendorID ;
private String Name ;
private String addressLine1;
private String addressLine2;
private int PrimaryPhone;
private int SecondoryPhone;
private String Email;
private String City;
private String State;
private String Country;
private String GSTN;
private int PinCode;



public VendorDetails() {
	//super();
}

public VendorDetails(int vendorID, String name, String addressLine1, String addressLine2, int primaryPhone,
		int secondoryPhone, String email, String city, String state, String country, String gSTN, int pinCode) {
	super();
	VendorID = vendorID;
	Name = name;
	this.addressLine1 = addressLine1;
	this.addressLine2 = addressLine2;
	PrimaryPhone = primaryPhone;
	SecondoryPhone = secondoryPhone;
	Email = email;
	City = city;
	State = state;
	Country = country;
	GSTN = gSTN;
	PinCode = pinCode;
}

public int getVendorID() {
	return VendorID;
}
public void setVendorID(int vendorID) {
	VendorID = vendorID;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddressLine1() {
	return addressLine1;
}
public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}
public String getAddressLine2() {
	return addressLine2;
}
public void setAddressLine2(String addressLine2) {
	this.addressLine2 = addressLine2;
}
public int getPrimaryPhone() {
	return PrimaryPhone;
}
public void setPrimaryPhone(int primaryPhone) {
	PrimaryPhone = primaryPhone;
}
public int getSecondoryPhone() {
	return SecondoryPhone;
}
public void setSecondoryPhone(int secondoryPhone) {
	SecondoryPhone = secondoryPhone;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
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
	return "VendorDetails [VendorID=" + VendorID + ", Name=" + Name + ", addressLine1=" + addressLine1
			+ ", addressLine2=" + addressLine2 + ", PrimaryPhone=" + PrimaryPhone + ", SecondoryPhone=" + SecondoryPhone
			+ ", Email=" + Email + ", City=" + City + ", State=" + State + ", Country=" + Country + ", GSTN=" + GSTN
			+ ", PinCode=" + PinCode + "]";
}

}