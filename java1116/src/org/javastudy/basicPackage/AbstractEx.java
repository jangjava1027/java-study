package org.javastudy.basicPackage;

abstract class Ab1{
	int num1;
	//추상매서드
	//선언부O
	abstract void m1();//구현X	
}
class A extends Ab1{
	int num2;
	@Override
	void m1() {
		System.out.println("추상매서드 오버라이딩");
	}
	
}


public class AbstractEx {

	public static void main(String[] args) {
		A a=new A();
		a.num1=100;
		a.num2=200;
	}
}
