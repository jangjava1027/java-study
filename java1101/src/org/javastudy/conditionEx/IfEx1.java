package org.javastudy.conditionEx;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		System.out.println("조건이 두개 일때");
		// 정수를 이용해서 90점이상이면 A출력 90~
		// 정수를 이용해서 80점이상이면 B출력 80~89 80<= A <90  80<=A && A>90
		// 정수를 이용해서 70점이상이면 C출력 70~79
		// 정수를 이용해서 60점이상이면 D출력 60~69
		// 정수를 이용해서 50점이상이면 F출력
		Scanner input = new Scanner(System.in);
		int kor = input.nextInt();
		

		if (kor >= 90) {
			System.out.println("A");
		}
		if (kor >= 80 && kor<90)
				System.out.println("B");

		if (kor >= 70 && kor<80)
				System.out.println("C");
		
		if (kor >= 60 && kor<70) {
			System.out.println("D");
		}
		if (kor < 60) {
			System.out.println("F");
		}

		System.out.println("프로그램 종료합니다.");
		input.close();

	}

}
