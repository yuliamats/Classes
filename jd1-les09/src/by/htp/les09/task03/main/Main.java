package by.htp.les09.task03.main;

import by.htp.les09.task03.bean.Country;
import by.htp.les09.task03.bean.District;
import by.htp.les09.task03.bean.Region;
import by.htp.les09.task03.bean.Status;
import by.htp.les09.task03.bean.Town;
import by.htp.les09.task03.service.CountryLogic;
import by.htp.les09.task03.view.CountryView;

//������� ������ ������ �����������, ��������� ������ �������, �����, �����.
// ������: ������� �� ������� �������, ���������� ��������, �������, ���������
// ������

public class Main {

	public static void main(String[] args) {
		District d1 = new District("��������� �����");
		d1.addTown(new Town("�����", Status.CAPITALCITY, 146.12));
		District d2 = new District("������������� �����");
		d2.addTown(new Town("����������", Status.CITY, 84.96));
		District d3 = new District("������� �����");
		d3.addTown(new Town("�����", Status.CAPITAL, 348.8));
		District d4 = new District("��������� �����");
		d4.addTown(new Town("�������", Status.CAPITALCITY, 134.6));

		Region r1 = new Region("��������� �������");
		r1.addDistrict(d1);
		r1.addDistrict(d2);
		Region r2 = new Region("������� �������");
		r2.addDistrict(d3);
		Region r3 = new Region("��������� �������");
		r3.addDistrict(d4);

		Country country = new Country("��������");
		country.addRegion(r1);
		country.addRegion(r2);
		country.addRegion(r3);

		CountryLogic cLogic = new CountryLogic();
		cLogic.findCapital(country);
		cLogic.findCapitalCity(country);
		cLogic.calcNumOfRegion(country);
		cLogic.calcTotalSquare(country);

		System.out.println("������� " + cLogic.findCapital(country).getName());
		System.out.println("���������� �������� " + cLogic.calcNumOfRegion(country));
		System.out.println("����� ������� " + cLogic.calcTotalSquare(country));

	}

}
