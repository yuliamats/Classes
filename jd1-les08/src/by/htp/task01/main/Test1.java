package by.htp.task01.main;

//Создайте класс Test1 c двумя переменными. Добавьте метод вывода на экран и
// методы изменения этих переменных. Добавьте метод, который находит сумму
// значений этих переменных, и метод, который находит наибольшее значение из
// этих двух переменных.

public class Test1 {
	private int numA;
	private int numB;

	public Test1() {
	}

	public Test1(int numA, int numB) {
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

	public void setNum(int numA, int numB) {
		this.numA = numA;
		this.numB = numB;
	}

	public int sum() {
		int temp;
		temp = this.numA + this.numB;
		return temp;
	}

	public int max() {
		if (this.numA < this.numB) {
			return this.numA;
		} else {
			return this.numB;
		}
	}

	public void print() {
		System.out.print("numA=" + this.numA + "\n\t" + "numB=" + this.numB + "\n");
	}
}
