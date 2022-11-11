package org.study.polymorphism;

public class Sub2 extends Parent{

	public int num2;
	
	@Override
	public void excuteQueryCommend() {
		System.out.println("오버라이딩Sub2");
	}
	
	public void m2() {
		System.out.println("인스턴스m2");
	}
}
