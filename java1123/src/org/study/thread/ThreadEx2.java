package org.study.thread;

import java.awt.Toolkit;

class ThreadSub2 extends Thread{
	int num=0;
	
	@Override
	public void run() {
		//run매서드
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		
		for(int i=0;i<10;i++) {
			System.out.println("ThreadSub2: num-> "+num++);
			toolkit.beep();//비프용
			
			try {
				Thread.sleep(1000);//1초 지연
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx2 {

	public static void main(String[] args) {
		
		ThreadSub2 t1= new ThreadSub2();
		t1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("main 스레드: "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main스레드 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
