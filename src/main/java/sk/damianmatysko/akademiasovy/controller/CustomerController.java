package sk.damianmatysko.akademiasovy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.damianmatysko.akademiasovy.entity.Customer;
import sk.damianmatysko.akademiasovy.service.CustomerService;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/list")
    public String listCustomers(Model model){
        List<Customer> customers=customerService.getCustomers();
        model.addAttribute("customers", customers);
        return "list-customers";
    }
}
