package com.gluczkowski.Hexagonal.adapters.out.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gluczkowski.Hexagonal.adapters.out.client.response.AddressResponse;

@FeignClient(
    name = "FindAddressByZipCodeClient",
    url = "${gluczkowski.client.address.url}"
)
public interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
