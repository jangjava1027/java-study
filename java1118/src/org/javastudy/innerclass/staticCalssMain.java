package org.javastudy.innerclass;

public class staticCalssMain {
	public static void main(String[] args) {
		System.out.println("static클래스");
		
		staticCalss.StaticBasic s1=new staticCalss.StaticBasic();
		s1.age=10;
		s1.name="static클래스";
		
		System.out.println("나이: "+s1.age);
		System.out.println("이름: "+s1.name);
		
		
	}
	
}
