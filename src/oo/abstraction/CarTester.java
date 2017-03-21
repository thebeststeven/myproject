package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("TOYOTA", 1800, "ALTIS");
		Car c2 = new Car("HONDA", 2000, "ACCORD");
		Car c3 = new Car("TOYOTA", 1800, "WISH");
		int[] n = new int[5];
		System.out.println(n[3]);
		Car[] cars = new Car[3];
		System.out.println(cars[0]);
		cars[0] = new Car("TOYOTA", 1800, "ALTIS");
		cars[1] = new Car("HONDA", 2000, "ACCORD");
		cars[2] = new Car("TOYOTA", 1800, "WISH");
		for (int i = 0; i < 3; i++) {
			System.out.println(cars[i].name);
		}
		cars[0].id = 301;
		cars[1].id = 400;
		cars[2].id = 403;
	}

}
