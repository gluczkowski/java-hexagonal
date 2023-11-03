package com.gluczkowski.Hexagonal.adapters.in.consumer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.gluczkowski.Hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.gluczkowski.Hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {
    
    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
