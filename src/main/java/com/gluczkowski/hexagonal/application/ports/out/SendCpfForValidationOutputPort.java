package com.gluczkowski.Hexagonal.application.ports.out;

public interface SendCpfForValidationOutputPort {
    
    void send(String cpf);
}
