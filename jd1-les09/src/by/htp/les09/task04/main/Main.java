package by.htp.les09.task04.main;

import java.util.Collections;

import by.htp.les09.task04.bean.Account;
import by.htp.les09.task04.bean.AccountGroup;
import by.htp.les09.task04.bean.Client;
import by.htp.les09.task04.service.AccountBalanceComparator;
import by.htp.les09.task04.service.AccountGroupLogic;
import by.htp.les09.task04.view.ClientView;

//Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Ivanov", "Ivan", new AccountGroup());
		client.getAccountGroup().addAccount(new Account("BY59BLBB30141200022004475560", 850.44, "active"));
		client.getAccountGroup().addAccount(new Account("BY59BLBB30141200022004475564", 50.22, "active"));
		client.getAccountGroup().addAccount(new Account("BY59BLBB30141200022004475565", -0.31, "active"));
		client.getAccountGroup().addAccount(new Account("BY59BLBB30141200022004475562", 0.01, "blocked"));

		AccountGroupLogic grLogic = new AccountGroupLogic();
		Collections.sort(client.getAccountGroup().getAccountGroup(), new AccountBalanceComparator());
		
		ClientView cView = new ClientView();
		cView.print(client);
		cView.print(grLogic.findAccountByNumber(client, "BY59BLBB30141200022004475569"));
		System.out.println(grLogic.calcSumBalance(client));
		System.out.println(grLogic.calcSumPositiveBalance(client));
	}
}
