package com.gluczkowski.Hexagonal.application.ports.out;

import com.gluczkowski.Hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    void update(Customer customer);
}
