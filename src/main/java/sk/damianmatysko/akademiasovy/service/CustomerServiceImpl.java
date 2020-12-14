package sk.damianmatysko.akademiasovy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sk.damianmatysko.akademiasovy.dao.CustomerDAO;
import sk.damianmatysko.akademiasovy.entity.Customer;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDAO.saveCustomer(customer);

    }

    @Override
    @Transactional
    public Customer getCustomer(int id) {
        return customerDAO.getCustomers(id);
    }


}
