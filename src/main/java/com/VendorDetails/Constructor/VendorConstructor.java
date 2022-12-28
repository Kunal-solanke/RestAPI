package com.VendorDetails.Constructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.VendorDetails.Entity.VendorDetails;
import com.VendorDetails.Servicer.VendorService;

@RestController
public class VendorConstructor
{
	@Autowired
	private VendorService vendorService;
	
	@GetMapping("/VendoreHome")
 public String VendoreHome()
 {
	 return "this is Vendor Details home Page";
	 
 }
	@GetMapping("/VendorDetails")
	public List<VendorDetails> getVendorDetails()
	{
		return this.vendorService.getVendorDetails();
	}
	
	@GetMapping("/VendorDetails/{VendorID}")
	public VendorDetails getVendorDetails(@PathVariable String VendorID)
	{
		return this.vendorService.getVendorDetails(Long.parseLong(VendorID));
		
	}
	@PostMapping("/VendorDetails")
	public VendorDetails addVendor(@RequestBody VendorDetails vendorDetails)
	{
		return this.vendorService.addVendor(vendorDetails);
	}
	
	@PutMapping("/VendorDetailsPut")
	public VendorDetails putVendor(@RequestBody VendorDetails vendorDetails)
	{
		return this.vendorService.putVendor(vendorDetails);
		
	}
	@DeleteMapping("VendorDetails/{VendorID}")
	public ResponseEntity<HttpStatus> deleteVendor(@PathVariable String VendorID)
	{
		try
		{
		 this.vendorService.deleteVendor(Long.parseLong(VendorID));
		 return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
 