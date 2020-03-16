package by.htp.les09.task03.main;

import by.htp.les09.task03.bean.Country;
import by.htp.les09.task03.bean.District;
import by.htp.les09.task03.bean.Region;
import by.htp.les09.task03.bean.Status;
import by.htp.les09.task03.bean.Town;
import by.htp.les09.task03.service.CountryLogic;
import by.htp.les09.task03.view.CountryView;

//Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные
// центры

public class Main {

	public static void main(String[] args) {
		District d1 = new District("Брестский район");
		d1.addTown(new Town("Брест", Status.CAPITALCITY, 146.12));
		District d2 = new District("Барановичский район");
		d2.addTown(new Town("Барановичи", Status.CITY, 84.96));
		District d3 = new District("Минский район");
		d3.addTown(new Town("Минск", Status.CAPITAL, 348.8));
		District d4 = new District("Витебский район");
		d4.addTown(new Town("Витебск", Status.CAPITALCITY, 134.6));

		Region r1 = new Region("Брестская область");
		r1.addDistrict(d1);
		r1.addDistrict(d2);
		Region r2 = new Region("Минская область");
		r2.addDistrict(d3);
		Region r3 = new Region("Витебская область");
		r3.addDistrict(d4);

		Country country = new Country("Беларусь");
		country.addRegion(r1);
		country.addRegion(r2);
		country.addRegion(r3);

		CountryLogic cLogic = new CountryLogic();
		cLogic.findCapital(country);
		cLogic.findCapitalCity(country);
		cLogic.calcNumOfRegion(country);
		cLogic.calcTotalSquare(country);

		System.out.println("столица " + cLogic.findCapital(country).getName());
		System.out.println("количество областей " + cLogic.calcNumOfRegion(country));
		System.out.println("общая площадь " + cLogic.calcTotalSquare(country));

	}

}
