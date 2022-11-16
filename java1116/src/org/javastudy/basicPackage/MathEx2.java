package org.javastudy.basicPackage;

import java.util.Random;

public class MathEx2 {

	public static void main(String[] args) {
		System.out.println("Math");
		
		int lotto[] =new int[45];
		
		for (int i=0;i<45;i++) {
			lotto[i]=i+1;
//			System.out.println(lotto[i]+" ");
		}
		System.out.println();
		
		int temp=0;
		for(int i=0;i<1000;i++) {
			int idx=(int)(Math.random()*45);
//			int idx2=new Random().nextInt(45);
			temp=lotto[idx];
			lotto[idx]=lotto[0];
			lotto[0]=temp;
		}
		
		String result="";
		for(int i=0;i<6;i++) {
			result +=lotto[i]+" ";
		}
		System.out.println(result);
	}
}
