package org.study.polymorphism;

class A{
	int a;
	
}
class B extends A{
	int b;

}
class C extends B{
	int c;
}
public class PolymorphismEx1 {

	
	public static void main(String[] args) {
		int i=10;
		//다형성
		A a=new A();
		a.a=10;		
		a=new B();
		a=new C();
		
//		A a2=new B();
//		a2.a=20;
//		A a3=new C();
//		a3.a=30;
		
//		A a=new A();
//		B b=new B();
//		C c=new C();
//		
//		a.a=10;
//		
//		b.a=20;
//		b.b=30;
//		
//		c.a=100;
//		c.b=200;
//		c.c=300;
//		
//		A a2=new B();
//		
//		a2.a=200;
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
