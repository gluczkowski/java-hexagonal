package com.gluczkowski.Hexagonal.application.ports.out;

import java.util.Optional;

import com.gluczkowski.Hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdOutputPort {
    
    Optional<Customer> find(String id);

}
