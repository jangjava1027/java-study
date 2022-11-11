package org.study.abstractEx;

//구현객체<-추상클래스Abstract1
public class Abstract1Sub1 extends Abstract1 {

	@Override
	public void abstractM1() {
		System.out.println("추상매서드abstractM1");
	}

	@Override
	public void abstractM2(String name) {
		System.out.println(name);
	}
	

}
