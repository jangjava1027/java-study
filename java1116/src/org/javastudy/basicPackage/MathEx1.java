package org.javastudy.basicPackage;

import java.util.Random;

public class MathEx1 {

	public static void main(String[] args) {
		System.out.println("Math");
//		double d1=Math.random();
//		System.out.println(d1);
		
		//1~100까지의 랜덤한 정수(10번실행)
//		for(int i=0;i<10;i++) {
//			
//			System.out.println((int)(Math.random()*100)+1);
//		}
		//1~45까지의 랜덤한 정수(10번실행)
		System.out.println();
		for(int i=0;i<10;i++) {
			
			System.out.print((int)(Math.random()*45)+1);
		}
		System.out.println();
		System.out.println("===============================");
		System.out.println(Math.min(100,50));//최솟값
		System.out.println(Math.max(100,50));//최댓값
		System.out.println(Math.abs(-100));//절대값
		System.out.println(Math.ceil(11.2));//올림
		System.out.println(Math.floor(11.2));//내림
		System.out.println(Math.round(11.5));//반올림
		System.out.println(Math.round(11.2));//반올림
		System.out.println(Math.PI);
		
		//
		System.out.println();
		Random r=new Random();
		int rad1=r.nextInt();//정수값 랜덤
		int rad2=r.nextInt(100);// 0<= <100
		
		System.out.println(rad1);
		System.out.println(rad2);
		
		
		
	}
}
