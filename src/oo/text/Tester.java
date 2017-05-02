package oo.text;

import java.util.ArrayList;
import java.util.Scanner;

import oo.abstraction.Car;
import oo.stati.Student;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("TOYATO", 1000, "AA");
		ArrayList<String> a = new ArrayList();
		a.add("331");
		a.add("821");
//		a.add(123);
		a.add("886");
		System.out.println(a.size());
		a.add("554");
		System.out.println(a.size());
		a.set(2, "885");
		System.out.println(a);
		String data = (String)a.get(3);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers");
		String s = scanner.nextLine();
		String sub = s.substring(s.length()-3);
		System.out.println(sub);
//		int n =(int)a.get(3);
		Student student = new Student(0, 0, 0);
		
	}

}
