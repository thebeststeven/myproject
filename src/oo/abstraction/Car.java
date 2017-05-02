package oo.abstraction;

public class Car {
	String brand;
	int cc;
	String name;
	int id;
	String type;
	int status;
	float milage;

	public Car(String brand, int cc, String name) {
		this.brand = brand;
		this.cc = cc;
		this.name = name;
	}
	Car(){
		
	}

	public Car(String brand, String name) {
		this(brand, 0, name);
		System.out.println("haha");
	}

	public void setMilage(int m) {
		milage = m;
	}

	public float addMilage(int m) {
		milage = milage + m;
		return milage;
	}

	public void maintain() {
		status = 5;
	}

}
