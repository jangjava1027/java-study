package org.javastudy.loofEx;

import java.util.Scanner;

public class DowhileEx2 {

	public static void main(String[] args) {
		System.out.println("do~while");
		System.out.println("구구단");
//		int i=1;
//		
//		do {
//			
//			i++;
//			System.out.println(i+"단");
//			
//			int j=0;
//			do {
//				j++;
//				System.out.println(i+"*"+j+"="+(i*j));
//			}while(j<9);
//			
//		}while(i<9);
		// 시작단,끝단 입력받아서 시작부터~끝단까지 구구단을 콘솔에 출력
		Scanner input = new Scanner(System.in);
		System.out.print("시작단 입력: ");
		int num1 = input.nextInt();

		System.out.print("끝단 입력: ");
		int num2 = input.nextInt();

		int i = num1;
		do {
			System.out.println(i + "단");

			int j = 1;
			do {
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;

			} while (j < 10);

			i++;
		} while (i <= num2);

		input.close();
	}

}
