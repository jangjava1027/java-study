package org.javastudy.interfaceEx;

public interface InterfaceEx1 {

//	public int num1;
	public static final int MAXNUM=1000;//final상수
	
	public abstract void abstractMethod1();//abstract매서드
	public static void staticMethod() {
		System.out.println("static매서드");
	}
	
	default void defaultMethod() {
		System.out.println("dafault매서드");
	}
	
	
	
	
}
