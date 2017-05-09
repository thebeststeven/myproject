package oo.stati;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass=60;
	public Student(int english, int math, int chinese) {
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	public Student(){
		
	}
	public String toString(){
		return
				"eng:"+english + "\n"+
				"chinese:"+chinese +"\n"+
				"math:"+math;
	}
	static{
		System.out.println("haha");
	}
	public void print(){
		System.out.println(getScore(english)+"\t"+
	         getScore(math)+"\t"+getScore(chinese)+"\t");
	}
	protected String getScore(int score){
		if(score<pass){
			return String.valueOf(score)+"*";
		}else{
			return String.valueOf(score);
		}
	}

}
