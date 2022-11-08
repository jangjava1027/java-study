package org.javastudy.oop;

public class OverLoading {

	public void method1() {
		System.out.println("method1");
	}

	public void method1(int num1) {
		System.out.println(num1);
	}

	public void method1(int num1, String name) {
		System.out.println(num1);
		System.out.println(name);
	}

	public void method1(String name, int num1) {
		System.out.println(name);
		System.out.println(num1);
	}

}
