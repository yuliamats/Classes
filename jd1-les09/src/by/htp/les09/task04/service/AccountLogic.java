package by.htp.les09.task04.service;

import java.util.List;

import by.htp.les09.task04.bean.Account;

public class AccountLogic {
	public boolean isBlocked(Account account) {
		String str = "blocked";
		if (account.getStatus().compareToIgnoreCase(str) == 0) {
			return true;
		}
		return false;
	}
}
