package com.gluczkowski.Hexagonal.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gluczkowski.Hexagonal.adapters.out.repository.CustomerRepository;
import com.gluczkowski.Hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.gluczkowski.Hexagonal.application.core.domain.Customer;
import com.gluczkowski.Hexagonal.application.ports.out.InsertCustomerOutputPort;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
