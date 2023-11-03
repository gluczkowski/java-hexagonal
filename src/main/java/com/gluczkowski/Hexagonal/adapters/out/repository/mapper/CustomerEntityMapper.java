package com.gluczkowski.Hexagonal.adapters.out.repository.mapper;

import org.mapstruct.Mapper;

import com.gluczkowski.Hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.gluczkowski.Hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
}
