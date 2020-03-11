package by.htp.task07.service;

import by.htp.task07.bean.Tryangle;
import static java.lang.Math.*;

public class TryangleLogic {

	public double perimeter(Tryangle obj) {
		double x1 = obj.getX1();
		double y1 = obj.getY1();

		double x2 = obj.getX2();
		double y2 = obj.getY2();

		double x3 = obj.getX3();
		double y3 = obj.getY3();

		double temp1;
		double temp2;
		double temp3;

		double perimeter;

		temp1 = sqrt(pow(abs(x2 - x1), 2) + pow(abs(y2 - y1), 2));
		temp2 = sqrt(pow(abs(x3 - x1), 2) + pow(abs(y3 - y1), 2));
		temp3 = sqrt(pow(abs(x3 - x2), 2) + pow(abs(y3 - y2), 2));

		perimeter = temp1 + temp2 + temp3;
		perimeter = (double) round(perimeter * 100) / 100;

		return perimeter;
	}

	public double square(Tryangle obj) {
		double x1 = obj.getX1();
		double y1 = obj.getY1();

		double x2 = obj.getX2();
		double y2 = obj.getY2();

		double x3 = obj.getX3();
		double y3 = obj.getY3();

		double square;

		square = abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
		square = (double) round(square * 100) / 100;

		return square;
	}

	public double[] coordinate(Tryangle obj) {
		double x1 = obj.getX1();
		double y1 = obj.getY1();

		double x2 = obj.getX2();
		double y2 = obj.getY2();

		double x3 = obj.getX3();
		double y3 = obj.getY3();

		double[] mas = new double[2];

		mas[0] = (double) round(1 * (x1 + x2 + x3) / 3 * 100) / 100;
		mas[1] = (double) round(1 * (y1 + y2 + y3) / 3 * 100) / 100;

		return mas;
	}

	public boolean isTryangleExisted(double s) {
		if (s != 0) {
			return true;
		} else {
			return false;
		}
	}
}
