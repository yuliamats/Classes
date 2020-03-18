package by.htp.les09.task04.service;

import by.htp.les09.task04.bean.Account;
import by.htp.les09.task04.bean.AccountGroup;
import by.htp.les09.task04.bean.Client;

public class AccountGroupLogic {
	public double calcSumBalance(Client client) {
		double sum = 0;

		for (Account account : client.getAccountGroup().getAccountGroup()) {
			sum = sum + account.getBalance();
		}
		return sum;
	}

	public Account findAccountByNumber(Client client, String num) {
		for (Account account : client.getAccountGroup().getAccountGroup()) {
			if (account.getAccountNumber().compareToIgnoreCase(num) == 0) {
				return account;
			}
		}

		return null;
	}

	public double calcSumPositiveBalance(Client client) {
		double sum = 0;

		for (Account account : client.getAccountGroup().getAccountGroup()) {
			if (account.getBalance() >= 0) {
				sum = sum + account.getBalance();
			}
		}
		return sum;
	}

	public double calcSumNegativeBalance(Client client) {
		double sum = 0;

		for (Account account : client.getAccountGroup().getAccountGroup()) {
			if (account.getBalance() < 0) {
				sum = sum + account.getBalance();
			}
		}
		return sum;
	}
}
