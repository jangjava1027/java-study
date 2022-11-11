package org.study.abstractEx;

//추상클래스->추상매서드가 있는 클래스
public abstract class Abstract1 {

	int num1;
	
	public abstract void abstractM1();//추상매서드->미완성 매서드,선언부만 있고 구현부가 없는 매서드
	public abstract void abstractM2(String name);//구현객체의 상속을 통해서 강제로(반드시)오버라이딩해서 구현
	
	public void m1() {
		System.out.println("m1매서드(일반매서드)");//일반 매서드도 상속되지만 강제성은 없다.(상속받아서 쓰고싶으면 쓰고..)
	}
}
