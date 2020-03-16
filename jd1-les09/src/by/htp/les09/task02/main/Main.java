package by.htp.les09.task02.main;

import by.htp.les09.task02.bean.Car;
import by.htp.les09.task02.bean.Engine;
import by.htp.les09.task02.bean.FuelTank;
import by.htp.les09.task02.bean.Wheel;
import by.htp.les09.task02.service.CarLogic;
import by.htp.les09.task02.service.FuelTankLogic;
import by.htp.les09.task02.service.WheelLogic;

//Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.

public class Main {

	public static void main(String[] args) {
		Car car = new Car("мерседес W124", new Engine("бензиновый двигатель", 1.997), new Wheel("17-дюймовое колесо"),
				new FuelTank(0, 70, 35));
		String newType = "новое 17-дюймовое колево";
		WheelLogic logic1 = new WheelLogic();
		logic1.changeWheel(car, newType);

		FuelTankLogic logic2 = new FuelTankLogic();
		logic2.fuelCar(car, 30);

		CarLogic logic3 = new CarLogic();
		logic3.rideCar(car);

		System.out.println("марка автомобиля: " + car.getModel());
	}
}
