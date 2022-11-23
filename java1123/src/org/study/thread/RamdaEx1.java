package org.study.thread;

interface Inter1{
	void interm1();
}

interface Inter2{
	void interm2();
}

public class RamdaEx1 {

	public static void main(String[] args) {
		//interface Inter2 익명클래스 이용해서 추상매서드 interm2구현
		
		//익명클래스-> 인터페이스 추상매서드 구현
		Inter2 i3=new Inter2() {
			
			@Override
			public void interm2() {
				System.out.println("Inter2");
			}
		};
		i3.interm2();
		
		//람다식으로 -> 인터페이스 추상매서드 구현
		Inter2 i4=()->{
			System.out.println("Inter2");
		};
		i4.interm2();
		
		System.out.println("==========");
		
		//익명클래스로 interm1구현
		Inter1 i1=new Inter1() {
			
			@Override
			public void interm1() {
				System.out.println("추상매서드1");
			}
		}; 
		i1.interm1();
		
		Inter1 i2=()->{
			System.out.println("추상매서드2");
		};
		i2.interm1();
		
		
		
		
		
	}
}
