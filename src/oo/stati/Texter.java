package oo.stati;

import java.util.ArrayList;

public class Texter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Student.pass);
		Student stu1 = new Student(86, 78, 67);
		Student stu2 = new Student(65, 87, 34);
		stu1.pass=70;
		stu1.print();
		stu2.print();
		GraduateStudent gstu = new GraduateStudent(10, 10, 10);
		gstu.print();
		
		ArrayList<Student>list = new ArrayList<>();
		list.add(new Student(80,37,95));
		list.add(new Student(62,56,48));
		list.add(new Student(65,79,34));
		list.add(new GraduateStudent(79,64,73));
		list.add(new GraduateStudent(45,79,38));
		for(int i=0;i<list.size();i++){
			Student stu = list.get(i);
			stu.print();
		}
	}

}
