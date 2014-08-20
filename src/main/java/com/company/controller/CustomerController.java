package com.company.controller;

import com.company.model.Customer;
import com.company.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/")
public class CustomerController {

    private static final String CREATE_CUSTOMER_NAME = "create";
    private static final String LIST_CUSTOMER_NAME = "list";
    private static final String EXCEL_CUSTOMER_NAME = "excel";
    private static final String PDF_CUSTOMER_NAME = "pdf";
    private static final String EDIT_CUSTOMER_NAME = "edit";


    @Autowired
    CustomerServiceImpl customerService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome() {
        return "index";
    }


    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView create() {
        ModelAndView mv = new ModelAndView(CREATE_CUSTOMER_NAME, "command", new Customer());
        return mv;
    }


    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView search() {
        ModelAndView mv = new ModelAndView("search", "command", new Customer());
        return mv;
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable Integer id) {
        ModelAndView mv = new ModelAndView();

        Customer prep = new Customer();
        prep.setId(id);
        customerService.delete(prep);
        mv.setViewName("redirect:/list");

        return mv;
    }



    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable Integer id) {
        ModelAndView mv = new ModelAndView(EDIT_CUSTOMER_NAME);

        Customer prep = new Customer();
        prep.setId(id);

        List<Customer> customers = (List<Customer>) customerService.findById(prep);
        mv.addObject("customers", customers);

        return mv;
    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView List() {
        ModelAndView mv = new ModelAndView(LIST_CUSTOMER_NAME);


        //CustomerService customerService = new CustomerServiceImpl();
        List<Customer> customers = customerService.findAll();
        mv.addObject("customers", customers);
        return mv;
    }


    @RequestMapping(value = "/export/excel", method = RequestMethod.GET)
    public ModelAndView getExcel() {
        List<Customer> customerList = customerService.findAll();
        return new ModelAndView("CustomerListExcel", "customerList", customerList);
    }


    @RequestMapping(value = "/export/pdf", method = RequestMethod.GET)
    public ModelAndView getPdf() {
        List<Customer> customerList = customerService.findAll();
        return new ModelAndView("CustomerListPdf", "customerList", customerList);
    }


    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute("SpringWeb") Customer customer,
                              ModelMap model) {
        Customer prep = new Customer();
        prep.setUnvani(customer.getUnvani());
        prep.setAdi(customer.getAdi());
        prep.setTckn(customer.getTckn());
        prep.setSoyadi(customer.getSoyadi());
        customerService.create(prep);
        return "/list";
    }




    /*
        @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable Integer id) {
        ModelAndView mv = new ModelAndView();

        Customer prep = new Customer();
        prep.setId(id);
        customerService.delete(prep);
        mv.setViewName("redirect:/list");

        return mv;
    }
     */

    @RequestMapping(value = "/editCustomer", method = RequestMethod.POST)
    public String editCustomer(@ModelAttribute("SpringWeb") Customer customer,
                              ModelMap model) {
        Customer prep = new Customer();
        prep.setId(customer.getId());
        prep.setUnvani(customer.getUnvani());
        prep.setAdi(customer.getAdi());
        prep.setTckn(customer.getTckn());
        prep.setSoyadi(customer.getSoyadi());
        customerService.update(prep);
        return "/list";
    }


    @RequestMapping(value = "/searchCustomer", method = RequestMethod.POST)
    public ModelAndView searchCustomer(@ModelAttribute("SpringWeb") Customer customer, Model map) {

        ModelAndView mv = new ModelAndView(LIST_CUSTOMER_NAME);

        Customer prep = new Customer();
        prep.setUnvani(customer.getUnvani());
        prep.setTckn(customer.getTckn());
        prep.setSoyadi(customer.getSoyadi());
        prep.setAdi(customer.getAdi());
        List<Customer> customers = (List<Customer>) customerService.search(prep);
        mv.addObject("customers", customers);
        return mv;


    }



//
//        @RequestMapping(value = "/editCustomer", method = RequestMethod.POST)
//    public String editCustomer(@ModelAttribute("SpringWeb") Customer customer,
//                              ModelMap model) {
//        Customer prep = new Customer();
//        prep.setUnvani(customer.getUnvani());
//        prep.setAdi(customer.getAdi());
//        prep.setTckn(customer.getTckn());
//        prep.setSoyadi(customer.getSoyadi());
//        customerService.create(prep);
//        return "/list";
//    }
//
//





}