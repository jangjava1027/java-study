package org.study.study;

abstract class Ab1{
	//선언부
	public void m1() {
		//구현부
		System.out.println("m1");
	}
	//추상매서드
	public abstract void a1();
}
class Ab1Sub extends Ab1{

	@Override
	public void a1() {
		System.out.println("추상클래스 Ab1 오버라이드");
	}
	
}
//인터페이스
interface In1{
	//final상수
	final int NUM1=100;
	//추상매서드
	public abstract void inM();
	//default멤버
	default void m1() {
		System.out.println("default");
		
	}
}
class In1Sub implements In1{

	@Override
	public void inM() {
		System.out.println("인터페이스 In1 오버라이딩");
	}
	
}

public class ClassBasic2 {

	public static void main(String[] args) {
		
		Ab1Sub a1=new Ab1Sub();
		a1.a1();
		
		In1Sub in=new In1Sub();
		in.inM();

		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
