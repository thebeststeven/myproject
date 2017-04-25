package oo.stati;

public class Texter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Student.pass);
		Student stu1 = new Student(86, 78, 67);
		Student stu2 = new Student(65, 87, 34);
		stu1.pass=70;
		stu1.print();
		stu2.print();
	}

}
