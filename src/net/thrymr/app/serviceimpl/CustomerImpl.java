package net.thrymr.app.serviceimpl;

import net.thrymr.app.bean.CustomerBean;
import net.thrymr.app.models.Customer;
import net.thrymr.app.repository.CustomerRepository;
import net.thrymr.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public CustomerBean createCustomer(CustomerBean customerBean) {

        Customer customer = new Customer();
        customer.setId(customerRepository.count() + 1);
        customer.setName(customerBean.getName());
        customer.setCity(customerBean.getCity());
        customer.setCode(customerBean.getCode());
        customer.setAgentCode(customerBean.getAgentCode());
        customer.setCountry(customerBean.getCountry());
        customer.setGrade(customerBean.getGrade());
        customer.setPhoneNumber(customerBean.getPhoneNumber());
        customer.setOpeningAmount(customerBean.getOpeningAmount());

        customerRepository.save(customer);

        return customerBean;
    }


}
