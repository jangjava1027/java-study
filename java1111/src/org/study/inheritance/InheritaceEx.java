package org.study.inheritance;

class A{
	public int num1;
	private int num2;
	protected int num3;
	
	public A() {
		super();
	}
	
	public A(String name) {
		System.out.println("A method");
		
	}
	
	public void method1() {
		System.out.println("A method1");
	}
}

class B extends A{
	int num4;
	
//	public B() {
//		super();
//	}
//	public B() {
//		super("문자열");
//		System.out.println("B생성자");
//	}
	
	@Override
	public void method1() {
		System.out.println("오버라이드 method1");
	}
}

public class InheritaceEx {

	public static void main(String[] args) {
		
		A a=new B();
		
		
		
		
//		A a=new A();
//		a.num1=1;
//		a.num3=2;
//		a.method1();
//		
//		B b=new B();
//		b.num1=3;
//		b.num3=4;
//		b.num4=5;
//		b.method1();
		
		
		
	}
	
}
