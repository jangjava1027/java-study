package org.javastudy.loofEx;

import java.util.Scanner;

public class WhileEx7 {

	public static void main(String[] args) {

		System.out.println("while(true)");
		// while(true)이용해서
		// 계산기(+-*/)->"exit"를 입력하면 while문 종료
		// 정수 두숫자 입력, 연산자입력(+-*/)->Scanner이용
		// 연산자에 따라 연산을 실행->연산자 "+" 숫자1+숫자2+두수의 합
		// 콘솔에 출력
		// if~else if, Scanner,변수2개(정수),String(연산자)1개
		// while(true)사용

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("숫자1 입력: ");
			int num1 = input.nextInt();
			System.out.print("숫자2 입력: ");
			int num2 = input.nextInt();
			System.out.print("연산자 입력: ");
			String op = input.next();
			if (op.equals("+")) {
				System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			} else if (op.equals("-")) {
				System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));

			} else if (op.equals("*")) {
				System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));

			} else if (op.equals("/")) {
				System.out.println(num1 + "/" + num2 + "=" + ((double)num1 / num2));

			} else if (op.equals("exit")) {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("연산자 입력오류->다시 입력하세요.");
			}

		}

		input.close();
		
	}

}
