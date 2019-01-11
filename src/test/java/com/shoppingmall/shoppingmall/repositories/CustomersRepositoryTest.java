package com.shoppingmall.shoppingmall.repositories;

import com.shoppingmall.entity.Customer;
import com.shoppingmall.repositories.CustomerRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
// use actual database. No mocking db.
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CustomersRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	public void testFindByIdCustomer() {
		Customer mockCustomer = new Customer();
		mockCustomer.setFirstName("bobby");
		mockCustomer.setCreatedAt(new Date());
		mockCustomer.setUpdatedAt(new Date());
		Customer persistedCustomer = entityManager.merge(mockCustomer);
		Optional<Customer> customerWrapper = customerRepository.findById(1);
		Customer customer = customerWrapper.get();
		Assert.assertEquals("both must be equal", customer.getFirstName(), "bobby");
	}
}
