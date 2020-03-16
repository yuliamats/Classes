package by.htp.les09.task02.service;

import by.htp.les09.task02.bean.Car;
import by.htp.les09.task02.bean.Wheel;

public class WheelLogic {
	public void changeWheel(Car car, String newType) {
		Wheel newWheel = new Wheel(newType);
		car.setWheel(newWheel);
	}
}
