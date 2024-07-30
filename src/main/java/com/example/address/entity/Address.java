package com.example.address.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address 
{
 @Id

	private long id;
	private String name;
	private String city;
	private long mobile;
}
