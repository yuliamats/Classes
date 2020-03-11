package by.htp.task08.bean;

import java.util.Arrays;

public class Company {
private Customer[] customers;

public Company() {
	
}

public Customer[] getCustomers() {
	return customers;
}

public void setCustomers(Customer[] customers) {
	this.customers = customers;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Arrays.hashCode(customers);
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Company other = (Company) obj;
	if (!Arrays.equals(customers, other.customers))
		return false;
	return true;
}

@Override
public String toString() {
	return "Company [customers=" + Arrays.toString(customers) + "]";
}



}
