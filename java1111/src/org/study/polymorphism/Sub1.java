package org.study.polymorphism;

public class Sub1 extends Parent{

	public int num1;
	
	@Override
	public void excuteQueryCommend() {
		System.out.println("오버라이딩Sub1");
	}
	
	public void m1() {
		System.out.println("인스턴스m1");
	}
}
