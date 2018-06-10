package demo.service;

import demo.repository.*;
import demo.model.*;
import java.util.*;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository= new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see demo.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
