package by.htp.task03.main;

public class StudentInspector {

	public static void main(String[] args) {
		Student[] mas = new Student[10];
		mas[0] = new Student("Ivan Ivanov", 22, new int[] { 5, 4, 6, 10, 9 });
		mas[1] = new Student("Sergei Petrov", 42, new int[] { 5, 9, 9, 10, 9 });
		mas[2] = new Student("Petr Sidorov", 22, new int[] { 5, 4, 6, 10, 9 });
		mas[3] = new Student("Stepan Andreev", 22, new int[] { 5, 4, 6, 10, 9 });
		mas[4] = new Student("Fedor Kozlov", 42, new int[] { 5, 4, 6, 10, 9 });
		mas[5] = new Student("Vlad Zuk", 22, new int[] { 9, 9, 9, 10, 9 });
		mas[6] = new Student("Anton Stepanov", 22, new int[] { 4, 4, 6, 7, 9 });
		mas[7] = new Student("Igor Orlov", 22, new int[] { 9, 10, 9, 10, 9 });
		mas[8] = new Student("Ignat Nazarov", 42, new int[] { 8, 9, 6, 7, 9 });
		mas[9] = new Student("Matvei Los", 42, new int[] { 8, 8, 6, 7, 7 });

		Student[] aLevelStudents;
		aLevelStudents = StudentAction.findAlevelStudent(mas);
		StudentAction.print(aLevelStudents);
	}
}
