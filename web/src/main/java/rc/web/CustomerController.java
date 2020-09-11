package rc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rc.domain.Customer;
import rc.persistence.CustomerRepository;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository){

        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public List<Customer> getAll(){

        List<Customer> customerList = this.customerRepository.findAll();

        return customerList;
    }
}
