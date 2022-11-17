package org.study.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.println("Exception");
		//ArrayIndexOutOfBoundsException
		//배열의 인덱스 초과시
		int[] arrInt=new int[5];
		
		try {
			for(int i=0;i<6;i++) {
				arrInt[i]=i;				
			}
			System.out.println("Success!!");
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();//주로 쓰임
//			System.out.println(e.getMessage());
		}finally {
			//Connection close
			System.out.println("기본 실행문");
		}
		
		System.out.println("프로그램 정상 실행");
		
		
		
		
		
		
		
	}
}
