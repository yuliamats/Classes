package by.htp.task08.service;

import java.util.Comparator;

import by.htp.task08.bean.Customer;

public class CustomerAlphabetComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		int result = o1.getSurname().compareToIgnoreCase(o2.getSurname());

		if (result != 0) {
			return result;
		} else {
			result = o1.getName().compareToIgnoreCase(o2.getName());
			if (result != 0) {
				return result;
			} else {
				return o1.getPatrName().compareToIgnoreCase(o2.getPatrName());
			}
		}
	}
}