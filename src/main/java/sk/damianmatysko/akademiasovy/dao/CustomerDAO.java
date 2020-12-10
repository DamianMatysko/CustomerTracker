package sk.damianmatysko.akademiasovy.dao;

import sk.damianmatysko.akademiasovy.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomers();
}
