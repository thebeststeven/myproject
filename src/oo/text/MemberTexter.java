package oo.text;

public class MemberTexter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member();
		member.setAge(-5);
		System.out.println(member.getAge());
		
		PhoneMember member2 = new PhoneMember();
		PhoneMember member3 = new PhoneMember("Hank");
	}

}
