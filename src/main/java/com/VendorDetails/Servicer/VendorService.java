package com.VendorDetails.Servicer;

import java.util.List;

import com.VendorDetails.Entity.VendorDetails;

public interface VendorService
{
	public List<VendorDetails> getVendorDetails();
	
	public VendorDetails getVendorDetails(long VendorID);
	
	public VendorDetails addVendor(VendorDetails vendorDetails);
	
	public VendorDetails putVendor(VendorDetails vendorDetails);
	
	public void deleteVendor(long parseLong);
	
}
