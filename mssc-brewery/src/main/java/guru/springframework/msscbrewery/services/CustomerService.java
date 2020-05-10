package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID id);

    CustomerDto saveNewCustomer(CustomerDto customerDTO);

    void updateBeer(UUID id, CustomerDto customerDto);

    void deleteById(UUID id);

}
