package org.study.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		System.out.println("Exception");
		//InputMismatchException->입력값과 변수의 타입 불일치
		
		Scanner input=new Scanner(System.in);
		System.out.println("정수입력: ");
		try {
			int num=input.nextInt();
			System.out.println(num);
			System.out.println("Success!!");			
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}finally {
			System.out.println("기본 실행문");
		}
		
		System.out.println("프로그램 정상 실행");
		
	
		
		
		
		
	}
}
