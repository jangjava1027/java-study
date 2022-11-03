package org.javastudy.conditionEx;

import java.util.Scanner;

public class IfEx2 {
	
	public static void main(String[] args) {
		System.out.println("조건이 하나 일때");
		
		System.out.print("아이디 입력: ");
		String id="m111";
		
		Scanner input=new Scanner(System.in);
		
		String userId=input.next();
		
		if(userId.equals(id)) {
			System.out.println("중복 아이디입니다.");
		}
		if(!userId.equals(id)) {
			System.out.println("중복 아이디가 아닙니다.");
		}
		
		
		
		System.out.println("프로그램 종료합니다.");
		input.close();
		
		
		
		
		
	}

}
