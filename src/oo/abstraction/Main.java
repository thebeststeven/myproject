package oo.abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("TOYATO", 2000, "name");
		c.setMilage(25000);
		float current=c.addMilage(80);
		System.out.println(current);
	}

}
