package com.company.service;

import com.company.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerService {
    public Customer create(Customer customer);

    public Customer delete(Customer customer);

    public List<Customer> findAll();

    public Customer update(Customer customer);

    public List<Customer> findById(Customer customer);

    public List<Customer> search(Customer customer);
}
