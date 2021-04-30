package com.edm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edm.model.Address;

@Repository
public interface IAddressDao extends JpaRepository<Address, Integer>{

}
