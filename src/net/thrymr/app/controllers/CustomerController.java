package net.thrymr.app.controllers;

import net.thrymr.app.bean.CustomerBean;
import net.thrymr.app.serviceimpl.CustomerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "customer/")
public class CustomerController {

    @Autowired
    CustomerImpl customerImpl;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public void createCustomer(CustomerBean customerBean) {
        customerImpl.createCustomer(customerBean);
    }
}
