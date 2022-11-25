package org.study.thread;

class Thread3 extends Thread {
	String str = "Java database";

	@Override
	public void run() {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

public class Class1 {

	public Class1() {
		System.out.println("기본 생성자");
	}

	public static void main(String[] args) {
		
		Thread3 t1=new Thread3();
		t1.start();

		new Class1();

		String str = "12345";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println(str);
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(4));
	}
}