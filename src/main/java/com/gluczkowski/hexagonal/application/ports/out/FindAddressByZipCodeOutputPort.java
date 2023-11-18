package com.gluczkowski.Hexagonal.application.ports.out;

import com.gluczkowski.Hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
