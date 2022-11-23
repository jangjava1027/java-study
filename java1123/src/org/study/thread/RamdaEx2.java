package org.study.thread;
//클래스멤버->필드,매서드,생성자
//부모클래스
class A{
	//필드
	public int num1;
	public int num2;
	public int num3;
	//생성자
	public A() {
		System.out.println("생성자(기본 생성자)");
	}
	
	//매서드->일하는~
	//선언부
	public void m1() {
		//구현부
		System.out.println("m1");
	}
}
//상속
class B extends A{
	
	@Override
	public void m1() {
		System.out.println("오버라이딩m1");
	}
	
	public void m2() {
		System.out.println("m2");
	}
}
//추상클래스->추상매서드(미완성매서드-> 선언부만 있고 구현부가 없는 매서드,객체생성X)
abstract class A1{
	public int num1;//인스턴스 멤버
	//추상매서드
	public abstract void abstractM1();
	public void m1() {
		System.out.println("m1");
	}
}
class Ab1Sub extends A1{

	@Override
	public void abstractM1() {
		System.out.println("추상매서드 오버라이딩(필수)");
	}
	@Override
	public void m1() {
		System.out.println("일반매서드 오버라이딩(선택)");
	}
	
}
//인터페이스-> 멤버(추상매서드,final상수,default,static,일반멤버X,객체생성x)
interface In1{
	final int MAXNUM=1000;
	public abstract void ab1();
	default void defaultM() {
		System.out.println("default매서드");
	}
}
class In1Sub implements In1{

	@Override
	public void ab1() {
		System.out.println("추상매서드 ab1 오버라이딩->필수");
	}
	@Override
	public void defaultM() {
		System.out.println("default매서드 defaultM 오버라이딩->선택");
	}
}


public class RamdaEx2 {

	public static void main(String[] args) {
		
		A a1=new B();//다형성
		B b1=new B();
		
		//익명 클래스->이름이 없는 클래스
		
		A a2=new A() {
			@Override
			public void m1() {
				System.out.println("오버라이딩");
			}
		};
		a2.m1();
		
//		A a3=()->{};//람다식은 interface에서 구현
		
		//추상클래스
		
		new A1() {

			@Override
			public void abstractM1() {
				System.out.println("추상클래스 오버라이딩1");
			}
			
		}.abstractM1();
		System.out.println("================");
		
		A1 ab2=new A1() {
			
			@Override
			public void abstractM1() {
				System.out.println("추상클래스 오버라이딩2");
			}
			
		};
		ab2.abstractM1();
		
		System.out.println("================");
		//인터페이스
		new In1() {
			
			@Override
			public void ab1() {
				System.out.println("인터페이스 ab1_1");
			}
		}.ab1();
		
		System.out.println("========람다식========");
		
		In1 in1=()->{
			System.out.println("인터페이스ab1_2");
		};
		in1.ab1();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
