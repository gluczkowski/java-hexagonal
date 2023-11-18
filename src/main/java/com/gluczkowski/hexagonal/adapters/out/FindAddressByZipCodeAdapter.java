package com.gluczkowski.Hexagonal.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gluczkowski.Hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.gluczkowski.Hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.gluczkowski.Hexagonal.application.core.domain.Address;
import com.gluczkowski.Hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort{

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
    
}
