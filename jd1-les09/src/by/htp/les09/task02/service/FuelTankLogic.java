package by.htp.les09.task02.service;

import by.htp.les09.task02.bean.Car;
import by.htp.les09.task02.bean.FuelTank;

public class FuelTankLogic {
	public void fuelCar(Car car, int countOfFuel) {
		FuelTank currentFuelTank = car.getFuelTank();
		int newValue = currentFuelTank.getCurrentValue() + countOfFuel;
		
		if (newValue >= currentFuelTank.getMaxValue()) {
			System.out.println("вы пытаетесь залить слишком много топлива в бак!");
			return;
		} else {
			currentFuelTank.setCurrentValue(newValue);
			car.setFuelTank(currentFuelTank);
		}
	}
}
