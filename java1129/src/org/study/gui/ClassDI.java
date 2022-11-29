package org.study.gui;

import java.sql.Date;

class A{
	public A() {
		System.out.println("A기본생성자");
	}
}
interface A1{
	void m1(int a);
}

class B{
	
	A a;
	A1 a1;
	Date day;
	
	public B() {
		System.out.println("B기본생성자");
	}
	public B(A a) {//DI ->생성자 통해서 주입
		this.a=a;
	}			   //   ->매서드를 통해 주입
	public void dayMethod(Date day) {
		this.day=day;
		System.out.println();
	}
	public A getA() {
		return a;
	}
	
	public Date getDay() {
		return day;
	}
	
	public void inter(A1 a1) {
		this.a1=a1;
	}
}

public class ClassDI {
	
	public static void strM(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		//매개변수에 객체타입
		new B(new A());
		//매개변수에 인터페이스-> 익명클래스
		new B().inter(new A1() {
			@Override
			public void m1(int a) {
				System.out.println("A1인테페이스 inter매서드 구현-> 익명클래스");
			}
		});
		//매개변수에 인터페이스-> 람다식
		new B().inter((int a)->{
			System.out.println("A1인테페이스 inter매서드 구현-> 람다식");
		});
		
		
	}
}
