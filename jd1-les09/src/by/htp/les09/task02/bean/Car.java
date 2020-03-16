package by.htp.les09.task02.bean;

public class Car {
	private String model;
	private Engine engine;
	private Wheel wheel;
	private FuelTank fuelTank;

	public Car() {

	}

	public Car(String model, Engine engine, Wheel wheel, FuelTank fuelTank) {
		this.model = model;
		this.engine = engine;
		this.wheel = wheel;
		this.fuelTank = fuelTank;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public FuelTank getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(FuelTank fuelTank) {
		this.fuelTank = fuelTank;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((fuelTank == null) ? 0 : fuelTank.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
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
		Car other = (Car) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (fuelTank == null) {
			if (other.fuelTank != null)
				return false;
		} else if (!fuelTank.equals(other.fuelTank))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", engine=" + engine + ", wheel=" + wheel + ", fuelTank=" + fuelTank + "]";
	}

}
