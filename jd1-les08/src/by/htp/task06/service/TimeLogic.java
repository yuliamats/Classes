package by.htp.task06.service;

import by.htp.task06.bean.Time;

public class TimeLogic {

	public void increase(Time obj, int hour, int minute, int second) {
		int newHour;
		int newMinute;
		int newSecond;

		newHour = obj.getHour() + hour;
		newMinute = obj.getMinute() + minute;
		newSecond = obj.getSecond() + second;

		if (newSecond >= 60) {
			newSecond -= 60;
			newMinute++;
		}

		if (newMinute >= 60) {
			newMinute -= 60;
			newHour++;
		}

		if (newHour >= 24) {
			newHour -= 24;
		}
		obj.setHour(newHour);
		obj.setMinute(newMinute);
		obj.setSecond(newSecond);
	}

	public void decrease(Time obj, int hour, int minute, int second) {
		int newHour;
		int newMinute;
		int newSecond;

		newHour = obj.getHour() - hour;
		newMinute = obj.getMinute() - minute;
		newSecond = obj.getSecond() - second;

		if (newSecond < 0) {
			newSecond += 60;
			newMinute--;
		}

		if (newMinute < 0) {
			newMinute += 60;
			newHour--;
		}

		if (newHour < 0) {
			newHour += 24;
		}
		obj.setHour(newHour);
		obj.setMinute(newMinute);
		obj.setSecond(newSecond);
	}

}
