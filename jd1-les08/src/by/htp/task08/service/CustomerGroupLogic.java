package by.htp.task08.service;

import java.util.ArrayList;
import java.util.List;

import by.htp.task08.bean.Customer;
import by.htp.task08.bean.CustomerGroup;

public class CustomerGroupLogic {

	public CustomerGroup findCustomerByCardNumber(CustomerGroup group, long start, long end) {
		CustomerGroup result = new CustomerGroup();

		for (Customer customer : group.getCustomerGroup()) {
			if (customer.getCreditCardNumber() >= start && customer.getCreditCardNumber() <= end) {
				result.addCustomer(customer);
			}
		}
		return result;
	}
}
