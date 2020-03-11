package by.htp.task06.view;

import by.htp.task06.bean.Time;

public class TimeView {

	public void print(Time clock) {
		if (clock.getHour() < 10) {
			System.out.print("0" + clock.getHour() + "ч. ");
		} else {
			System.out.print(clock.getHour() + "ч. ");
		}

		if (clock.getMinute() < 10) {
			System.out.print("0" + clock.getMinute() + "мин. ");
		} else {
			System.out.print(clock.getMinute() + "мин. ");
		}

		if (clock.getSecond() < 10) {
			System.out.print("0" + clock.getSecond() + "с. " + "\n");
		} else {
			System.out.print(clock.getSecond() + "с. " + "\n");
		}
	}
}
