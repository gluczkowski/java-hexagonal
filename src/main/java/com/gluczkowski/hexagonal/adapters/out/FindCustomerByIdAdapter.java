package com.gluczkowski.Hexagonal.adapters.out;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gluczkowski.Hexagonal.adapters.out.repository.CustomerRepository;
import com.gluczkowski.Hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.gluczkowski.Hexagonal.application.core.domain.Customer;
import com.gluczkowski.Hexagonal.application.ports.out.FindCustomerByIdOutputPort;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    
    

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
    
}