package by.htp.task08.main;

import java.util.Collections;

import by.htp.task08.bean.Customer;
import by.htp.task08.bean.CustomerGroup;
import by.htp.task08.service.CustomerAlphabetComparator;
import by.htp.task08.service.CustomerGroupLogic;
import by.htp.task08.view.CustomerView;

//Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class Main {
	public static void main(String[] args) {
		CustomerGroup company = new CustomerGroup();
		company.addCustomer(
				new Customer(1, "Иванов", "Дмитрий", "Иванович", 4374880000003366L, "BY59BLBB30141200022004475562"));
		company.addCustomer(
				new Customer(2, "Петров", "Андрей", "Петрович", 4374880000003586L, "BY59BLBB30141200022004475563"));
		company.addCustomer(
				new Customer(3, "Степанов", "Матвей", "Ильич", 4374880000003544L, "BY59BLBB30141200022004475564"));
		company.addCustomer(
				new Customer(4, "Андреев", "Алексей", "Фомич", 4374880000003144L, "BY59BLBB30141200022004475565"));
		company.addCustomer(
				new Customer(5, "Сергеев", "Илья", "Степанович", 437488000000374L, "BY59BLBB30141200022004475566"));
		company.addCustomer(new Customer(6, "Степанов", "Матвей", "Дмитриевич", 43748800000037766L,
				"BY59BLBB30141200022004475567"));

		Collections.sort(company.getCustomerGroup(), new CustomerAlphabetComparator());

		CustomerView cView = new CustomerView();
		cView.print(company);

		CustomerGroupLogic grLogic = new CustomerGroupLogic();
		grLogic.findCustomerByCardNumber(company, 4374880000000000L, 4374880000003580L);

		System.out.println("список покупателей, у которых номер кредитной карточки находится в заданном интервале:");
		cView.print(grLogic.findCustomerByCardNumber(company, 4374880000003544L, 4374880000003780L));

	}
}
