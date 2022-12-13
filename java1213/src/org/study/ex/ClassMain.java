package org.study.ex;


class ThreadClass extends Thread{
	
	@Override
	public void run() {
		
		int idx=0;
		for(int i=0;i<10;i++) {
			
			System.out.println("idx: "+idx++);
			
			try {
				Thread.sleep(1000);//1초 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class ClassMain {

	public static void main(String[] args) {
		
		ThreadClass t1=new ThreadClass();
		t1.start();
		
		
		//인스턴스화(객체화)
		ClassA a=new ClassA();
		ClassA a2=new ClassA(10);
		
		A a3=new A();
		//다형성-> 부모타입의 객체 참조변수로 자식객체를 가리킨다.
		A a4=new B();
		a4.a=100;//부모필드만
		a4.a1();//부모필드만
		
		B b1=new B();
		b1.a=100;//부모필드
		b1.b=200;//자식필드
		b1.a1();//부모 매서드 오버라이딩
		
	}
}
