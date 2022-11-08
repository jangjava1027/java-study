package org.javastudy.oop;

public class MethodBasicMain {

	public static String userId;
	
	public static void main(String[] args) {
		
		userId="m111";//static메소드는 static필드를 사용
		
		MethodBasic.classMethod1();
		
		MethodBasic method1=new MethodBasic();
		
		method1.method1();
		System.out.println(method1.method2());
		int sum=method1.method2();
		System.out.println(sum);
		
		method1.method3(100, 200);
		
		int sum2=method1.method4(200, 300);
		System.out.println(sum2);
		
	}
	
	
}
