package org.javastudy.oop;

public class ClassBasic {

	//멤버
	
	//필드->속성,프로퍼티
	//인스턴스멤버
	public int age;
	public String userName;
	public String userPw;
	public String userPhone;
	//클래스멤버
	public static final String PROJECTNAME="JAVA2022";
	
	
	//메소드
	//인스턴스멤버
	public void instanceMethod() {
		System.out.println("인스턴스 메소드");
	}
	//클래스멤버
	public static void classMethod() {
		System.out.println("클래스 메소드");
	}
	
	
	
	
}
