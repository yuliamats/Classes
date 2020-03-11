package by.htp.task07.view;

import by.htp.task07.bean.Tryangle;

public class TryangleView {

	public void print(Tryangle tr) {
		System.out.println("Треугольник с координатами вершин: " + "(" + tr.getX1() + ";" + tr.getY1() + ")" + " , "
				+ "(" + tr.getX2() + ";" + tr.getY2() + ")" + " , " + "(" + tr.getX3() + ";" + tr.getY3() + ")");
	}

	public void print(double[] mas) {
		if (mas == null) {
			return;
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
}