package com.edm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edm.model.Address;
import com.edm.repository.IAddressDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AddressService implements IAddressService {

	@Autowired
	IAddressDao addressDao;

	@Override
	public Address add(Address address) {
		log.info("In method add");
		return addressDao.save(address);
	}

}
