package by.htp.task04.main;

import java.util.List;
import by.htp.task04.bean.Train;
import by.htp.task04.service.TrainLogic;
import by.htp.task04.view.TrainConsoleInput;
import by.htp.task04.view.TrainView;

public class Main {
	public static void main(String[] args) {
		TrainView view = new TrainView();
		TrainConsoleInput input = new TrainConsoleInput();

		TrainLogic logic = new TrainLogic();

		List<Train> trains;
		trains = input.create();

		logic.sortByNumber(trains);
		logic.sortByStationAndDate(trains);

		view.print(trains);

	}
}
