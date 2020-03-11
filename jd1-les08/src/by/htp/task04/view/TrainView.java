package by.htp.task04.view;

import java.util.List;
import by.htp.task04.bean.Train;

public class TrainView {

	public void print(Train train) {
		System.out.print("TRAIN: number" + train.getNumber() + "\n\t" + train.getDestinationStation() + "\n" + train.getDate() + "\n");
	}

	public void print(List<Train> trains) {
		for (Train train : trains) {
			print(train);
		}

	}
	
	public void printList(List<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
