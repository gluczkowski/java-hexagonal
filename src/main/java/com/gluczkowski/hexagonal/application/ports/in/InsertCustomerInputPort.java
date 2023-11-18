package com.gluczkowski.Hexagonal.application.ports.in;

import com.gluczkowski.Hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert (Customer customer, String zipCode);
}
