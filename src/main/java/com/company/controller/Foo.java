package com.company.controller;


import com.company.model.Customer;
import com.company.service.CustomerService;
import com.company.service.CustomerServiceImpl;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class Foo {
    public static void main(String args[]) {
        ModelAndView mv = new ModelAndView();

        System.out.println("Main method calisti");
        System.out.println(1);
        CustomerService customerService = new CustomerServiceImpl();
        System.out.println(2);

        List<Customer> customers = customerService.findAll();
        System.out.println(3);
        mv.addObject("customers", customers);
        System.out.println(4);
        System.out.println(mv);
        ;

    }

}

