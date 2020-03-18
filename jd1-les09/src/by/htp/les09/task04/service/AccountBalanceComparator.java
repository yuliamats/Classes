package by.htp.les09.task04.service;

import java.util.Comparator;

import by.htp.les09.task04.bean.Account;

public class AccountBalanceComparator implements Comparator<Account> {

	@Override
	public int compare(Account a1, Account a2) {
		double c1 = a1.getBalance();
		double c2 = a2.getBalance();
		if (c1 < c2)
			return -1;
		if (c1 > c2)
			return 1;
		return 0;
	}
}
