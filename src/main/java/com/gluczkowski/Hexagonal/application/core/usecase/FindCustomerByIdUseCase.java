package com.gluczkowski.Hexagonal.application.core.usecase;

import com.gluczkowski.Hexagonal.application.core.domain.Customer;
import com.gluczkowski.Hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.gluczkowski.Hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id)
            .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

}
