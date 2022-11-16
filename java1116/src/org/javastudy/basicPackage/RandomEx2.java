package org.javastudy.basicPackage;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		
		System.out.println("Random");
		
		Random rd=new Random();
		//5번 실행->정수값을 랜덤
		for(int i=0;i<5;i++) 
			System.out.println(rd.nextInt());
		System.out.println();
		for(int i=0;i<5;i++)
			System.out.println(rd.nextInt(45)+1);
		System.out.println();
		
		//5번 실행->랜덤 소수점 두자리(printf)
		for(int i=0;i<5;i++)
			System.out.printf("Random -> %.2f\n",rd.nextDouble());
		
		
		
		
		
		
	}
}
