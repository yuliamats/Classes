package by.htp.les09.task04.service;

import java.util.Comparator;

import by.htp.les09.task04.bean.Account;

public class AccountNumberComparator implements Comparator<Account> {

	@Override
	public int compare(Account a1, Account a2) {
		String c1 = a1.getAccountNumber();
		String c2 = a2.getAccountNumber();
		return c1.compareToIgnoreCase(c2);

	}
}
