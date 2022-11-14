package org.javastudy.interfaceEx;

interface A1{
	abstract void a1();
}
interface B1{
	abstract void b1();
}
class ABSub {
	
}
				//클래스와 클래스간은 extends,인터페이스와 인터페이스간에는 implements
public class InterfaceEx5Main extends ABSub implements A1,B1{
	@Override
	public void b1() {
		System.out.println("오버라이딩b1");
	}

	@Override
	public void a1() {
		System.out.println("오버라이딩a1");
		
	}
	public static void main(String[] args) {
//		a1();//static은 static만 사용가능
		
		
		
		
		
		
	}
}
