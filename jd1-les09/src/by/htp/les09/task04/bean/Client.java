package by.htp.les09.task04.bean;

public class Client {
	private String surname;
	private String name;
	private AccountGroup accountGroup;

	public Client() {

	}

	public Client(String surname, String name, AccountGroup accountGroup) {
		this.surname = surname;
		this.name = name;
		this.accountGroup = accountGroup;
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

	public AccountGroup getAccountGroup() {
		return accountGroup;
	}

	public void setAccountGroup(AccountGroup accountGroup) {
		this.accountGroup = accountGroup;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountGroup == null) ? 0 : accountGroup.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Client other = (Client) obj;
		if (accountGroup == null) {
			if (other.accountGroup != null)
				return false;
		} else if (!accountGroup.equals(other.accountGroup))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
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
		return "Client [surname=" + surname + ", name=" + name + ", accountGroup=" + accountGroup + "]";
	}

}
