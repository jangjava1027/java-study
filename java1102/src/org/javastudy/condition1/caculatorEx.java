package org.javastudy.condition1;

import java.util.Scanner;

public class caculatorEx {

	public static void main(String[] args) {
		System.out.println("산술계산");

		Scanner input = new Scanner(System.in);
		System.out.println("숫자1: ");
		int num1 = input.nextInt();
		System.out.println("숫자2: ");
		int num2 = input.nextInt();

		System.out.println("연산자입력: ");
		String op = input.next();

		if (op.equals("+")) {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		} else if (op.equals("-")) {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		} else if (op.equals("*")) {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		} else if (op.equals("/")) {
			System.out.println(num1 + "/" + num2 + "=" + ((double)num1 / num2));

		} else {
			System.out.println("연산자 입력오류");
		}

	}
}
