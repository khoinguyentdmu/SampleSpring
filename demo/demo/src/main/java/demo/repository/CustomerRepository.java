package demo.repository;

import java.util.List;

import demo.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}