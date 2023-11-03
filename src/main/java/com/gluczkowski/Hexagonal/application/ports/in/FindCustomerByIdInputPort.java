package com.gluczkowski.Hexagonal.application.ports.in;

import com.gluczkowski.Hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(String id);
}
