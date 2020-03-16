package by.htp.les09.task02.service;

import by.htp.les09.task02.bean.Car;

public class CarLogic {
	public void rideCar(Car car) {
		int currentValue = car.getFuelTank().getCurrentValue();

		if (currentValue <= car.getFuelTank().getMinValue()) {
			System.out.println("нет топлива в баке");
		} else {
			System.out.println("поехали");
		}
	}
}
