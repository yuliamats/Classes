package by.htp.les09.task01.service;

import by.htp.les09.task01.bean.Sentence;
import by.htp.les09.task01.bean.Text;

public class TextLogic {
	public Text append(Text text, Sentence sentence) {
		text.addSentence(sentence);
		return text;
	}
}