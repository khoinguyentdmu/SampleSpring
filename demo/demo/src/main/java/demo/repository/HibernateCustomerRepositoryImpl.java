package demo.repository;

import demo.model.*;
import java.util.*;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see demo.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers= new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Khoi");
		customer.setLastName("Nguyen");
		
		customers.add(customer);
		return customers;
	}
}
