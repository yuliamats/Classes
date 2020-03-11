package by.htp.task02.main;

//Создйте класс Test2 c двумя переменными. Добавьте конструктор с входными
// параметрами. Добавьте конструктор, инициализирующий члены класса по
// умолчанию. Добавьте set- и get- методы для полей экземпляра класса.

public class Test2 {
	private int numA;
	private int numB;

	public Test2() {
		numA = 1;
		numB = 1;
	}

	public Test2(int numA, int numB) {
		this.numA = numA;
		this.numB = numB;
	}

	public int getNumA() {
		return numA;
	}

	public void setNumA(int numA) {
		this.numA = numA;
	}

	public int getNumB() {
		return numB;
	}

	public void setNumB(int numB) {
		this.numB = numB;
	}
}
