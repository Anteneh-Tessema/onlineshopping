package com.cs490.onlineshopping.admin.service;

import com.cs490.onlineshopping.admin.model.Address;
import com.cs490.onlineshopping.admin.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address saveAddress(Address address){
        return addressRepository.save(address);
    }
}
