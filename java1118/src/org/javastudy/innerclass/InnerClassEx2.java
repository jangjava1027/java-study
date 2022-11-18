package org.javastudy.innerclass;

public class InnerClassEx2 {

	public static void main(String[] args) {
		// 인스턴스화(객체화) new (객체생성,객체주소생성)
		// 클래스타입   //inner1->객체참조변수(객체의 주소값이 저장)
		InnerClassEx inner1 = new InnerClassEx();
		// 내부클래스 타입선언 //내부클래스 생성
		InnerClassEx.InstanceClass2 inC = inner1.new InstanceClass2();
//		new InnerClassEx().new InstanceClass2();
		inC.num1 = 100;
		inC.m1();
		// static은 다른 내부 클래스와 부르는 방법이 다름//static 클래스 생성 new 외부클래스,내부클래스();
		InnerClassEx.StaticClass2 s1 = new InnerClassEx.StaticClass2();
		InnerClassEx.StaticClass2.method1();// static매서드 구현

		// 지역클래스
		InnerClassEx inC2 = new InnerClassEx();
		inC2.localMethod();
		
	}
}
