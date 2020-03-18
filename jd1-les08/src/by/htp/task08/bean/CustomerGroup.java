package by.htp.task08.bean;

import java.util.ArrayList;
import java.util.List;

public class CustomerGroup {
	private List<Customer> customerGroup;

	public CustomerGroup() {
		customerGroup = new ArrayList<Customer>();
	}

	public List<Customer> getCustomerGroup() {
		return customerGroup;
	}

	public void setCustomerGroup(List<Customer> customerGroup) {
		this.customerGroup = customerGroup;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerGroup == null) ? 0 : customerGroup.hashCode());
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
		CustomerGroup other = (CustomerGroup) obj;
		if (customerGroup == null) {
			if (other.customerGroup != null)
				return false;
		} else if (!customerGroup.equals(other.customerGroup))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerGroup [customerGroup=" + customerGroup + "]";
	}
	
	public void addCustomer(Customer newCustomer) {
		customerGroup.add(newCustomer);
	}

}
