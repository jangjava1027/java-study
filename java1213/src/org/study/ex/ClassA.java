package org.study.ex;

class A{
	public int a;
	public void a1() {
		System.out.println("A, a1매서드");
	}
}
class B extends A{
	public int b;
	@Override
	public void a1() {
		System.out.println("오버라이딩 B, a1 매서드");
	}
}

public class ClassA {
//CalssA의 멤버
	public int num1;//필드
	public int num2;
	//객체유형1
	public ClassA() {
		System.out.println("생성자");
	}
	//객체유형2
	public ClassA(int num1) {
		System.out.println("생성자2");
		this.num1=num2;
	}
	
	public void method() {
		System.out.println("매서드");
	}
}
