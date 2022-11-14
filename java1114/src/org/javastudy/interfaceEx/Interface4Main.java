package org.javastudy.interfaceEx;

interface A{
	void a1();
}
interface A2{
	void a2();
}
interface B extends A,A2{
	void b1();
}
class AB implements B{

	@Override
	public void a1() {
		System.out.println("");
	}

	@Override
	public void a2() {
		System.out.println("");
	}

	@Override
	public void b1() {
		System.out.println("");
	}
	
}


public class Interface4Main {

	public static void main(String[] args) {
		
		AB a=new AB();
		a.a1();
		a.a2();
		a.b1();
		
		
	}
	
	
	
}
