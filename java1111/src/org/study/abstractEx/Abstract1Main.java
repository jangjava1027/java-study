package org.study.abstractEx;

public class Abstract1Main {

	public static void main(String[] args) {
		
		Abstract1Sub1 a1=new Abstract1Sub1();
		a1.abstractM1();
		a1.abstractM2("추상매서드2");
		
		Abstract1Sub1Sub a2=new Abstract1Sub1SubSub();
		a2.abstractM1();
		a2.abstractM2("a1");
		a2.abstractM3();
		
		//부모 타입-> 자식객체
		//다형성
		Abstract1 a3=new Abstract1Sub1SubSub(); 
		a3.num1=10;
		a3.abstractM1();
		a3.abstractM2("name");
		a3.m1();
		
		//구현객체간의 상속관계 없으면 다형성 성립X
//		Abstract1Sub1 a4=new AbstractSub1SubSub();
		
	}
}
