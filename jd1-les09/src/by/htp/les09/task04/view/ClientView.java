package by.htp.les09.task04.view;

import by.htp.les09.task04.bean.Account;
import by.htp.les09.task04.bean.Client;

public class ClientView {
	public void print(Client client) {
		System.out.print("Client: " + client.getSurname() + " " + client.getName() + "\n");
		for (Account account : client.getAccountGroup().getAccountGroup()) {
			System.out.println(account.getStatus() + " " + account.getAccountNumber() + " " + account.getBalance());
		}
	}

	public void print(Account account) {
		try {
			System.out.println(account.getStatus() + " " + account.getAccountNumber() + " " + account.getBalance());
		} catch (NullPointerException e) {
			System.out.println("нет данных, удовлетворяющих условиям поиска");
		}
	}
}
