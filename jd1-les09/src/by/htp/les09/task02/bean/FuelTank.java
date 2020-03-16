package by.htp.les09.task02.bean;

public class FuelTank {
	private int minValue;
	private int maxValue;
	private int currentValue;

	public FuelTank() {
		this.minValue = 0;
	}
	
	public FuelTank(int minValue, int maxValue, int currentValue) {
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.currentValue = currentValue;
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

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentValue;
		result = prime * result + maxValue;
		result = prime * result + minValue;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FuelTank other = (FuelTank) obj;
		if (currentValue != other.currentValue)
			return false;
		if (maxValue != other.maxValue)
			return false;
		if (minValue != other.minValue)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FuelTank [minValue=" + minValue + ", maxValue=" + maxValue + ", currentValue=" + currentValue + "]";
	}
	
	
}
