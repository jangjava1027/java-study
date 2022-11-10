package org.study.oop;

import java.util.Scanner;

public class ConstructExMain {

	public static void main(String[] args) {

//		ConstructEx c1=new ConstructEx();
//		ConstructEx c2=new ConstructEx(10, 200);
		System.out.println("계산기");

		Scanner input = new Scanner(System.in);

		System.out.print("첫번재 숫자: ");
		int n1 = input.nextInt();
		System.out.print("두번재 숫자: ");
		int n2 = input.nextInt();
		System.out.print("연산자: ");
		String op2 = input.next();

		ConstructEx c3 = new ConstructEx(n1, n2, op2);

		int num1 = c3.getNum1();
		int num2 = c3.getNum2();
		String op = c3.getOp();

		if (op.equals("+")) {
			System.out.print(num1 + "+" + num2 + "=" + (num1 + num2));
		} else if (op.equals("-")) {
			System.out.print(num1 + "-" + num2 + "=" + (num1 - num2));
		} else if (op.equals("*")) {
			System.out.print(num1 + "*" + num2 + "=" + (num1 * num2));
		} else if (op.equals("/")) {
			System.out.print(num1 + "/" + num2 + "=" + ((double) num1 / num2));
		} else if (op.equals("%")) {
			System.out.print(num1 + "%" + num2 + "=" + (num1 % num2));
		} else {
			System.out.println("연산자 입력오류");
		}

//		System.out.println(c3.getNum1());
//		System.out.println(c3.getNum2());
//		System.out.println(c3.getOp());

	}

}
