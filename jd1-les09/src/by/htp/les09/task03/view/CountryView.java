package by.htp.les09.task03.view;

import java.util.List;

import by.htp.les09.task03.bean.Town;

public class CountryView {
	public void printCapitalName(Town town) {
		System.out.println("столица: " + town.getName());
	}

	public void printCapitalCities(List<Town> towns) {
		for (Town t : towns) {
			System.out.println(t.getName());
		}
	}
}
