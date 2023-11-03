package com.gluczkowski.Hexagonal.adapters.out.client.mapper;

import org.mapstruct.Mapper;

import com.gluczkowski.Hexagonal.adapters.out.client.response.AddressResponse;
import com.gluczkowski.Hexagonal.application.core.domain.Address;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    
    Address toAddress(AddressResponse addressResponse);
}
