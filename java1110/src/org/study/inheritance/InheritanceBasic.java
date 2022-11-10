package org.study.inheritance;

import java.text.DateFormat.Field;

class Parent {

	public int num1;
	private int num2;
	protected String op;

	public Parent() {// 기본생성자
	}

	public Parent(int num1) {// int타입 생성자
	}

	public void parentMethod() {
		System.out.println("parentMethod");
	}
}

class Son1 extends Parent {
	public int num3;

	// Son1의 기본 생성자
	public Son1() {
		super(10);// 부모에 기본,다른생성자가 있기때문에 옵션을선택할수있다.
	}

	@Override
	public void parentMethod() {
		System.out.println("자식parentMethod");
//		super.parentMethod();
	}
}

class Son2 extends Parent {
	public int num4;

	public Son2() {
		super(200);
	}

	public void son2Method() {
		System.out.println("son2Method");
	}
}


public class InheritanceBasic  {

	public static void main(String[] args) {
		Parent p = new Parent();
		Son1 s1 = new Son1();
		s1.parentMethod();
		Son2 s2 = new Son2();
		s2.parentMethod();
	}

}
