/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apaya.controller;

import com.apaya.bean.CustomerBean;
import com.apaya.dao.CustomerDao;
import com.apaya.entity.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    CustomerDao cd;
    
    @RequestMapping()
    public String addCustomer(Model model) {
        CustomerBean customerBean = new CustomerBean();
        model.addAttribute("customerBean", customerBean);
        List<Customer> custs =  cd.showAllCustomer();
        model.addAttribute("custs", custs);
        return "customerAdd";
    }
    
    @RequestMapping(value="/saveAdd")
    public String saveAddCustomer(@ModelAttribute("customerBean") CustomerBean customerBean, Model model) {
        
        Customer customer = new Customer();
        
        customer.setCustomerName(customerBean.getName());
        customer.setCustomerEmail(customerBean.getEmail());
        customer.setCustomerAddress(customerBean.getAddress());
        customer.setCustomerTelepon(customerBean.getTelepon());
        customer.setCustomerDob(customerBean.getDateofBirth());
        customer.setCustomerTanggungan(customerBean.getAttandance());
        customer.setCustomerGaji(customerBean.getSalary());
        customer.setCustomerPenghasilanTambahan(customerBean.getExtraRevenue());
        
        cd.addCustomer(customer);
        
        model.addAttribute("datacustomer", customerBean);
        return "redirect:/customer";
    }
    
}
