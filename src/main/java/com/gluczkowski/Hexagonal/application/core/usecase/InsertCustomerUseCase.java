package com.gluczkowski.Hexagonal.application.core.usecase;

import com.gluczkowski.Hexagonal.application.core.domain.Customer;
import com.gluczkowski.Hexagonal.application.ports.in.InsertCustomerInputPort;
import com.gluczkowski.Hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.gluczkowski.Hexagonal.application.ports.out.InsertCustomerOutputPort;
import com.gluczkowski.Hexagonal.application.ports.out.SendCpfForValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort InsertCustomerOutputPort;
    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort InsertCustomerOutputPort,
            SendCpfForValidationOutputPort sendCpfForValidationOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.InsertCustomerOutputPort = InsertCustomerOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);

        InsertCustomerOutputPort.insert(customer);
        sendCpfForValidationOutputPort.send(customer.getCpf());
    }

}
