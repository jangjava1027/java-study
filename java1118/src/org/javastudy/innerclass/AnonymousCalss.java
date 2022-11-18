package org.javastudy.innerclass;

interface A {
	void ab1();
}

class A1 implements A {
	@Override
	public void ab1() {

	}

}

public class AnonymousCalss {

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.ab1();

		// 익명클래스 new 부모(){}
		A a = new A() {
			@Override
			public void ab1() {
				System.out.println("오버라이딩2");
			}
		};
		a.ab1();
	}
}
