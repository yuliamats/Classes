package by.htp.task08.view;

import by.htp.task08.bean.Customer;
import by.htp.task08.bean.CustomerGroup;

public class CustomerView {
	public void print(CustomerGroup group) {
		for (Customer customer : group.getCustomerGroup()) {
			System.out.print("\n" + "Customer:" + customer.getId() + " " + customer.getSurname() + " "
					+ customer.getName() + " " + customer.getPatrName() + "\n\t" + customer.getCreditCardNumber() + " "
					+ customer.getAccountNumber() + "\n");
		}
	}
}
