package by.htp.task06.main;

import by.htp.task06.bean.Time;
import by.htp.task06.service.TimeLogic;
import by.htp.task06.view.TimeView;

public class Main {

	public static void main(String[] args) {
		Time clock = new Time(16, 10, 52);
		
		TimeView view = new TimeView();
		TimeLogic logic = new TimeLogic();
				
		logic.increase(clock, 10, 30, 40);
		view.print(clock);
		
		logic.decrease(clock, 0, 0, 59);
		view.print(clock);
	}
}
