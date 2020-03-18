package by.htp.task08.bean;

public class Customer {
	private int id;
	private String surname;
	private String name;
	private String patrName;
	private long creditCardNumber;
	private String accountNumber;

	public Customer() {

	}

	public Customer(int id, String surname, String name, String patrName, long creditCardNumber, String accountNumber) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patrName = patrName;
		this.creditCardNumber = creditCardNumber;
		this.accountNumber = accountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatrName() {
		return patrName;
	}

	public void setPatrName(String patrName) {
		this.patrName = patrName;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + (int) (creditCardNumber ^ (creditCardNumber >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patrName == null) ? 0 : patrName.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Customer other = (Customer) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (creditCardNumber != other.creditCardNumber)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patrName == null) {
			if (other.patrName != null)
				return false;
		} else if (!patrName.equals(other.patrName))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patrName=" + patrName
				+ ", creditCardNumber=" + creditCardNumber + ", accountNumber=" + accountNumber + "]";
	}

	
}
