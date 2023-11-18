package com.gluczkowski.Hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gluczkowski.Hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.gluczkowski.Hexagonal.adapters.out.UpdateCustomerAdapter;
import com.gluczkowski.Hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.gluczkowski.Hexagonal.application.core.usecase.UpdateCustomerUseCase;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }

}
