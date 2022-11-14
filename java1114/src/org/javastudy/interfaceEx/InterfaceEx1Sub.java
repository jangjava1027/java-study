package org.javastudy.interfaceEx;

public class InterfaceEx1Sub implements InterfaceEx1,InterfaceEx2{

	public int num1;
	public void method1() {
		System.out.println("mathod1매서드");
	}
	
	
	@Override
	public void abstractMethod1() {
		System.out.println("오버라이딩 interfaceMethod1");
	}
	
	@Override
	public void abstractMethod2() {
		System.out.println("오버라이딩 interfaceMethod2");
	}
	
	
	

	
	
	
}
