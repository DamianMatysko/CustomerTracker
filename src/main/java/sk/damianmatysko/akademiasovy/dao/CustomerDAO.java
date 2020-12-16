package sk.damianmatysko.akademiasovy.dao;

import sk.damianmatysko.akademiasovy.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int id);

    void deleteCustomer(int id);
}
