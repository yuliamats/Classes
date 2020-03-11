package by.htp.task05.main;

//Опишите класс, реализующий десятичный счетчик, который может увеличивать или
//уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите
//инициализацию счетчика значениями по умолчанию и произвольными значениями.
//Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
//получить //его текущее состояние. Написать код, демонстрирующий все
//возможности класса.

public class Counter {
	private int minValue;
	private int maxValue;
	private int currentValue;

	public Counter() {
		this.minValue = 0;
		this.maxValue = 100;
	}

	public Counter(int minValue, int maxValue) {
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public void getCurrentValue() {
		// return currentValue;
		System.out.println(currentValue);
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

	public void increase() {
		if (this.currentValue >= this.maxValue) {
			return;
		} else {
			this.currentValue++;
		}
	}

	public void decrease() {
		if (this.currentValue <= this.minValue) {
			return;
		} else {
			this.currentValue--;
		}
	}
}
