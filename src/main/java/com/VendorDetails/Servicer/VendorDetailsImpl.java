package com.VendorDetails.Servicer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VendorDetails.DAO.VendorDao;
import com.VendorDetails.Entity.VendorDetails;

@Service
public class VendorDetailsImpl implements VendorService {
	
	@Autowired
	private VendorDao venderDao;
	
	/* List<VendorDetails> list; */
		
	public VendorDetailsImpl()
	{
		/*
		 * list = new ArrayList(); list.add(new
		 * VendorDetails(1,"Kunal","Pune","thathawade Pune Vision ace",123456,32456,
		 * "kunal@gmail.com","pune","Maharashtra","India","abc",411057)); list.add(new
		 * VendorDetails(2,"Swapnil","Dhule","thathawade Pune Vision ace",23231,32456,
		 * "Swapnil@gmail.com","Dhule","Maharashtra","India","accc",));
		 */
	}
	@Override
	public List<VendorDetails> getVendorDetails() {
		
		return venderDao.findAll();
	}
	//@SuppressWarnings("deprecation")
	@Override
	public VendorDetails getVendorDetails(long VendorID) {
		/*
		 * VendorDetails v =null; for(VendorDetails vendor : list) {
		 * if(vendor.getVendorID() == VendorID) { v=vendor; break;
		 * 
		 * } }
		 */
		
		return venderDao.findById(VendorID).get();
		
	}
	@Override
	public VendorDetails addVendor(VendorDetails vendorDetails) {
		/* list.add(vendorDetails); */
		venderDao.save(vendorDetails);
		return vendorDetails ;
	}
	@Override
	public VendorDetails putVendor(VendorDetails vendorDetails) {
		/*
		 * list.forEach(e ->{ if(e.getVendorID() == vendorDetails.getVendorID()) {
		 * e.setAddressLine1(vendorDetails.getAddressLine1());
		 * e.setAddressLine2(vendorDetails.getAddressLine2());
		 * e.setEmail(vendorDetails.getEmail()); e.setName(vendorDetails.getName());
		 * e.setPrimaryPhone(vendorDetails.getPrimaryPhone());
		 * e.setSecondoryPhone(vendorDetails.getSecondoryPhone());
		 * e.setCity(vendorDetails.getCity()); e.setState(vendorDetails.getState());
		 * e.setCountry(vendorDetails.getCountry()); e.setGSTN(vendorDetails.getGSTN());
		 * e.setPinCode(vendorDetails.getPinCode());
		 * 
		 * } });
		 */
		venderDao.save(vendorDetails);
		return vendorDetails;
	}
	@Override
	public void deleteVendor(long parseLong) {
		
		/*
		 * list=this.list.stream().filter(e->e.getVendorID()!=parseLong).collect(
		 * Collectors.toList());
		 */
		//@SuppressWarnings("deprecation")
		VendorDetails entity= venderDao.findById(parseLong).get();
		venderDao.delete(entity);
	}
	

}
