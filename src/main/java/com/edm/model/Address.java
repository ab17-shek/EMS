package com.edm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int addressId;
	@NotNull
	private String addressType;
	@NotNull
	private String street;
	@NotNull
	private String city;
	@NotNull
	private String state;
	@NotNull
	private String country;
	
//	@JsonIgnoreProperties("addresses")
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "myEmployeeId", nullable = false)
//	private Employee employee;
}
