package by.htp.task01.main;

public class Test1Inspector {

	public static void main(String[] args) {
		Test1 obj1 = new Test1(4, 5);
		obj1.print();

		obj1.setNum(3, 7);
		obj1.print();

		System.out.println(obj1.sum());
		System.out.println(obj1.max());
	}

}
