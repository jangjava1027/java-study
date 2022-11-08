package org.javastudy.oop;

public class MethodBasic {

	public String userId;
	
	public void method0() {
		userId="m1111";
		System.out.println("id: "+userId);
	}
	
	
	//클래스메소드
	public static void classMethod1() {
//		userId="m222";
//		int i=10;
		System.out.println("클래스메소드");
	}
	
	//메소드
	//인스턴스 메소드
	//1
	public void method1() {
		System.out.println("반환값X,매개인자 X.method1");
//		return;//생략가능
	}
	//2
	public  int method2() {
		System.out.println("반환값O,매개X,method2");
		int num1=10;
		int num2=20;
		return num1+num2;
	}
	//3
	public  void method3(int num1,int num2) {
		System.out.println("반환값X,매개O,method3");
		System.out.println(num1+"+"+num2+"="+(num1+num2));
//		return;
	}
	//4
	public int method4(int num1,int num2) {
		System.out.println("반환값O,매개O,method4");
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		return num1+num2;
	}
	

	
	
	
	
	
	
	
	
}
