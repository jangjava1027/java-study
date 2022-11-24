package org.study.thread;

class Thread1 extends Thread{
	int num=1;
	@Override
	public void run() {
		System.out.println("Thread-> "+num++);
		
		for(int i=0;i<10;i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}		
}
public class ThreadJoin {

	public static void main(String[] args) {
		 
		System.out.println("main스레드 시작");
		Thread1 t1=new Thread1();
		t1.start();
		
		
		
	}
	
}
