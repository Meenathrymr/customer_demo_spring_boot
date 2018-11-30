package net.thrymr.app.service;

import net.thrymr.app.bean.CustomerBean;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    CustomerBean createCustomer(CustomerBean customerBean);

}
