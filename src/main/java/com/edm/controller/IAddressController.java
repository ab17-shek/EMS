package com.edm.controller;

import org.springframework.web.bind.annotation.RequestBody;

import com.edm.model.Address;

public interface IAddressController {
	
	public Address createAddress(@RequestBody Address address);
}
