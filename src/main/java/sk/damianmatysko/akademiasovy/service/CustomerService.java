package sk.damianmatysko.akademiasovy.service;

import sk.damianmatysko.akademiasovy.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int id);

    void deleteCustomer(int id);

}
