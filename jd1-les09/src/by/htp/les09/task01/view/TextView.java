package by.htp.les09.task01.view;

import java.util.List;

import by.htp.les09.task01.bean.Sentence;
import by.htp.les09.task01.bean.Text;
import by.htp.les09.task01.bean.Word;

public class TextView {
	public void printTitle(Text text) {
		System.out.println(text.getTitle());
	}

	public void print(Text text) {
		String str = text.toString();
		System.out.print(str);
	}
}
