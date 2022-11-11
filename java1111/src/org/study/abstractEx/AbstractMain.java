package org.study.abstractEx;

public class AbstractMain {

	public static void main(String[] args) {
		
//		new AbstractEx1();
//		new AbstractEx1Sub2();
		AbstractEx1Sub1 a2=new AbstractEx1Sub1();
		a2.abstractMethod1();
		
		AbstractEx1Sub2 a1=new AbstractEx1Sub2Sub();
		a1.abstractMethod1();
		a1.abstractMethod2();
		
		
	}
}
