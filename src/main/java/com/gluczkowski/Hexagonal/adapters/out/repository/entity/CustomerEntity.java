package com.gluczkowski.Hexagonal.adapters.out.repository.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.gluczkowski.Hexagonal.application.core.domain.Address;

import lombok.Data;

@Data
@Document(collection = "customers")
public class CustomerEntity {

    @Id
    private String id;

    private String name;

    private Address address;

    private String cpf;

    private Boolean isValidCpf;
}
