package com.example.address.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.address.entity.Address;
import com.example.address.model.Addressdetails;
import com.example.address.repository.Addressrepo;




@Service
public class Addressservice 
{
	@Autowired
public Addressrepo addressrepo;

	public Address saveaddress(Addressdetails addressdetails) 
	{
		Address address=new Address();
		address.setName(addressdetails.getName());
		address.setCity(addressdetails.getCity());
		address.setMobile(addressdetails.getMobile());
		Address savedAddressDetails = addressrepo.save(address);
		return savedAddressDetails;
	}
	
	
	public List<Address> savealladdress(List<Addressdetails> addressdetails)
	{
		List<Address> addresses=new ArrayList<>();
		 for (Addressdetails addressDetails : addressdetails) 
		 {
	            Address address = new Address();
	            address.setName(addressDetails.getName());
	            address.setCity(addressDetails.getCity());
	            address.setMobile(addressDetails.getMobile());
	            addresses.add(address);
		 }
	            return addressrepo.saveAll(addresses);
	        }
	//get address
	public Address getAddress(Long id)
	{
		Optional<Address>optionalAddress=addressrepo.findById(id);
		if(optionalAddress.isPresent())
		{
			return optionalAddress.get();
		
		}
		else
		{
			return null;
		}
	}
}



	