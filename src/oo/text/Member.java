package oo.text;

public class Member {
	String id;
	private int age;
	String name;
	
	public Member(String name){
		System.out.println("a");
		this.name = name;
	}
	public Member(){
		
	}
	
	void setAge(int age){
		if(age<0){
			age=0;
		}
		this.age =age;
	}
	public int getAge(){
		return age;
	}

}
