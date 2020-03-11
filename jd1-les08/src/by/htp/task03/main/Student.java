package by.htp.task03.main;

//�������� ����� � ������ Student, ���������� ����: ������� � ��������, �����
// ������, ������������ (������ �� ���� ���������). �������� ������ �� ������
// ��������� ������ ����. �������� ����������� ������ ������� � ������� �����
// ���������, ������� ������, ������ ������ 9 ��� 10.

public class Student {
	private String name;
	private int groupNumber;
	private int[] marks = new int[5];

	public Student() {
	}

	public Student(String name, int groupNumber, int[] marks) {
		this.name = name;
		this.groupNumber = groupNumber;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
}
