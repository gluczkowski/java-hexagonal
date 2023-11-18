package com.gluczkowski.Hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gluczkowski.Hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.gluczkowski.Hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.gluczkowski.Hexagonal.application.core.usecase.FindCustomerByIdUseCase;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }

}
