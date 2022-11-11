package org.study.polymorphism;

class A{
	int num1;
}
class B extends A{
	int num2;
}
class C extends B{
	int num3;
}

public class PolymorphismEx {

	public static void main(String[] args) {
		
		A a=new C();
		a.num1=10;
		
		B b=new C();
		b.num1=20;
		b.num2=30;
		
		C c=new C();
		c.num1=40;
		c.num2=50;
		c.num3=60;
		
		
//		A a1=new A();
//		a1.num1=10;
//		A a2=new B();
//		a2.num1=20;
//		A a3=new C();
//		a3.num1=30;
//		
//		B b=new C();
//		b.num1=100;
//		b.num2=200;
//		
//		C c=new C();
//		c.num1=300;
//		c.num2=400;
//		c.num3=500;
		
	}
}
