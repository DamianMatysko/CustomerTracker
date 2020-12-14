package sk.damianmatysko.akademiasovy.service;

import sk.damianmatysko.akademiasovy.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    public Customer getCustomer(int id);
}
