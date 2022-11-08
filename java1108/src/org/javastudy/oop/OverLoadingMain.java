package org.javastudy.oop;

public class OverLoadingMain {

	public static void main(String[] args) {

		OverLoading over1 = new OverLoading();

		over1.method1();
		over1.method1(100);
		over1.method1(100, "OverLoding1");
		over1.method1("Overloding2", 100);

		System.out.println();
		System.out.println(true);
		System.out.println('c');
		System.out.println(new char[] { 'c', 'a', 'f', 'e' });
		System.out.println(1.15);
		System.out.println(1.15f);
		System.out.println(10);
		System.out.println(10L);
		System.out.println(new OverLoading());
		System.out.println(new String("String1"));
		System.out.println("String2");

	}

}
