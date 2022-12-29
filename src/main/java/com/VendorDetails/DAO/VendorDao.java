package com.VendorDetails.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.VendorDetails.Entity.VendorDetails;

@Repository
public interface VendorDao extends JpaRepository<VendorDetails, Long>
{

}
