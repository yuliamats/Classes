package by.htp.task07.main;

import by.htp.task07.bean.Tryangle;
import by.htp.task07.service.TryangleLogic;
import by.htp.task07.view.TryangleView;

public class Main {

	public static void main(String[] args) {
		Tryangle tr = new Tryangle(-1, 4, -1, 2, -7, 3); // координаты вершин треугольника
		double perimeter;
		double square;
		double[] mas = new double[2]; // координаты точки пересечения медиан треугольника

		TryangleView view = new TryangleView();
		view.print(tr);

		TryangleLogic logic = new TryangleLogic();
		square = logic.square(tr);
		if(logic.isTryangleExisted(square) == true) {
			System.out.println("площадь треугольника равна " + square);
			perimeter = logic.perimeter(tr);
		    System.out.println("периметр треугольника равен " + perimeter);
			mas = logic.coordinate(tr);
		    System.out.println("координаты точки пересечения медиан треугольника равны ");
		    view.print(mas);
		}
	}
}
