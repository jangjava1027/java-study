package org.javastudy.condition1;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
		System.out.println("switch");

		System.out.print("알파벳을 입력: ");
		Scanner input=new Scanner(System.in);
		
		String alpha=input.next();//알파벳(대소문자구별없이)한글자 입력
		
		switch(alpha) {
		case"a":
		case"A":
			System.out.println("A");
			break;
		case"b":
		case"B":
			System.out.println("B");
			break;
		case"c":
		case"C":
			System.out.println("C");
			break;
		default:
			System.out.println("a,A,b,B,c,C 이외의 알파벳입니다.");
		}
		
		

	}
}
