package by.htp.task05.main;

public class CounterInspector {

	public static void main(String[] args) {
		Counter obj = new Counter();
		obj.setCurrentValue(12);
		obj.increase();
		obj.getCurrentValue();

		obj.setCurrentValue(7);
		obj.decrease();
		obj.getCurrentValue();
	}
}
