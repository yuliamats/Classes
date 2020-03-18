package by.htp.les09.task04.bean;

import java.util.ArrayList;
import java.util.List;

public class AccountGroup {
	private List<Account> accountGroup;

	public AccountGroup() {
		accountGroup = new ArrayList<Account>();
	}

	public List<Account> getAccountGroup() {
		return accountGroup;
	}

	public void setAccountGroup(List<Account> accountGroup) {
		this.accountGroup = accountGroup;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountGroup == null) ? 0 : accountGroup.hashCode());
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
		AccountGroup other = (AccountGroup) obj;
		if (accountGroup == null) {
			if (other.accountGroup != null)
				return false;
		} else if (!accountGroup.equals(other.accountGroup))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccountGroup [accountGroup=" + accountGroup + "]";
	}

	public void addAccount(Account newAccount) {
		accountGroup.add(newAccount);
	}
}
