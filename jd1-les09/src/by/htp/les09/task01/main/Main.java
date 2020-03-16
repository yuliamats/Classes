package by.htp.les09.task01.main;

import by.htp.les09.task01.bean.Sentence;
import by.htp.les09.task01.bean.Text;
import by.htp.les09.task01.bean.Word;
import by.htp.les09.task01.service.TextLogic;
import by.htp.les09.task01.view.TextView;

//Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
// консоль текст, заголовок текста.

public class Main {
	public static void main(String[] args) {
		Text text = new Text("весна пришла");

		Sentence s1 = new Sentence();
		Sentence s2 = new Sentence();
		Sentence s3 = new Sentence();

		s1.addWord(new Word("весна"));
		s1.addWord(new Word("пришла"));
		s1.addWord(new Word("и"));
		s1.addWord(new Word("птицы"));
		s1.addWord(new Word("прилетают"));
		
		s2.addWord(new Word("сирень"));
		s2.addWord(new Word("цветет"));

		s3.addWord(new Word("а"));
		s3.addWord(new Word("сердце"));
		s3.addWord(new Word("замирает"));
		
		
		TextLogic logic = new TextLogic();
		text.addSentence(s1);
		text.addSentence(s2);
		logic.append(text, s3);

		TextView view = new TextView();
		view.printTitle(text);
		view.print(text);
	}
}
