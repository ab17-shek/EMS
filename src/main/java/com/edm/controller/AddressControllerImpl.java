package com.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.edm.model.Address;
import com.edm.service.IAddressService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class AddressControllerImpl implements IAddressController{
	
	@Autowired
	IAddressService addressService;
	
	@Override
	public Address createAddress(Address address) {
		log.info("In method createAddress");
		return addressService.add(address);
	}

}
