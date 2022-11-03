package org.study.operatorEx;

import java.util.Scanner;

public class Operator3 {

	public static void main(String[] args) {
		System.out.println("비교연산자");

		Scanner scn = new Scanner(System.in);

		System.out.print("숫자1: ");
		int num1 = scn.nextInt();

		System.out.print("숫자2: ");
		int num2 = scn.nextInt();

		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);

		if (num1 > 10) {
			System.out.println("num1은 10보다 큽니다.");
		}
		if (num2 > 10)
			System.out.println("num2는 10보다 큽니다.");

		int age = 11;
		String strAge = "11";

		System.out.println(age == 11);
		System.out.println(strAge.equals("11"));

		scn.close();
	}
}
