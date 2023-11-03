package com.gluczkowski.Hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gluczkowski.Hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.gluczkowski.Hexagonal.adapters.out.InsertCustomerAdapter;
import com.gluczkowski.Hexagonal.adapters.out.SendCpfValidationAdapter;
import com.gluczkowski.Hexagonal.application.core.usecase.InsertCustomerUseCase;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter, SendCpfValidationAdapter sendCpfValidationAdapter) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
