package com.shoppingmall.dao;

import com.shoppingmall.entity.Customer;
import com.shoppingmall.entity.CustomerWithNumberOfOrders;

import java.util.List;

public interface CustomerDAO {
	List<Customer> getCustomers();
	Customer getCustomer(int id);
  List<CustomerWithNumberOfOrders> getCustomersWithNumberOfOrders();
}
