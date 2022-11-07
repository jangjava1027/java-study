package org.javastudy.oop;

import java.util.Scanner;

public class CaculatorMain {

	public static void main(String[] args) {

		// Caculator 생성한후에 필드 num1,num2,op를 초기화
		// op에 따라서 +-*/%-> if~else if이용해서
		// 매서드 sum(+),sub(-),muti(*),div(/),rem(%)
		// 호출하는 프로그램을 작성하시오.

		Caculator c1 = new Caculator();

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("계산기를 실행하겠습니까? ");
			String bool = input.next();
			if (bool.equals("no")) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.print("첫번째 숫자: ");
				c1.num1 = input.nextInt();
				System.out.print("두번째 숫자: ");
				c1.num2 = input.nextInt();
				System.out.print("연산자 입력: ");
				c1.op = input.next();
				if (c1.op.equals("+")) {
					c1.sum();
				} else if (c1.op.equals("-")) {
					c1.sub();
				} else if (c1.op.equals("*")) {
					c1.muti();

				} else if (c1.op.equals("/")) {
					c1.div();
				} else if (c1.op.equals("%")) {
					c1.ren();
				} else if (c1.op.equals("exit")) {
					System.out.println("종료합니다.");
					break;
				} else {
					System.out.println("연산자입력오류-> 다시입력");
				}

			}
		}

		input.close();

	}

}
