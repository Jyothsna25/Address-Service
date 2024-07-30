package com.example.address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.address.entity.Address;
import com.example.address.model.Addressdetails;
import com.example.address.service.Addressservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RequestMapping("/add")
@RestController
public class Addresscontroller
{
	@Autowired
	 private Addressservice addressservice;
	 
      @PostMapping("/save")
		public Address saveaddress(@RequestBody Addressdetails addressdetails)
		{
	       System.out.println("the addres is"+addressdetails);
			Address savedaddress =  addressservice.saveaddress(addressdetails);
			return savedaddress;
			
		}
       @PostMapping("/saveall")

public List<Address>  savealladdress(@RequestBody List<Addressdetails> addressdetails)
{
	return addressservice.savealladdress(addressdetails);
}

@GetMapping("{id}")
public Address getAddress(@PathVariable long id)
{
	return addressservice.getAddress(id);
}
@GetMapping("/test")
public String getAddress()
{
	return "test";
}


}
