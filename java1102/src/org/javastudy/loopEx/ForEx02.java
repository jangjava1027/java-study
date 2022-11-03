package org.javastudy.loopEx;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		System.out.println("for문");

		for (int i = 0; i < 10; i++) {
			if (i < 9) {
				System.out.print(i + ",");
			} else {
				System.out.print(i);
			}
		}

		System.out.println();

		for (int i = 9; i >= 0; i--) {
			if (i == 0) {
				System.out.print(i);
			} else {
				System.out.print(i + ",");
			}
		}

		System.out.println();

		for (int i = 9; i >= 0; i--) {
			if (i == 0) {
				System.out.print(i);
				break;
			}
			System.out.print(i + ",");
		} // break문

		System.out.println();

		// Scanner이용,변수2개
		// 첫번째숫자,두번째숫자를 입력받아서
		// 첫번째숫자, 두번째 숫자 정수를 콘솔에 출력
		// 조건이 첫번째 숫자<두번째숫자
		Scanner input = new Scanner(System.in);

		System.out.print("첫번째숫자: ");
		int firstnum = input.nextInt();

		System.out.print("두번째숫자: ");
		int lastnum = input.nextInt();

		if (firstnum < lastnum) {
			for (int i = firstnum; i < lastnum; i++) {
				if (i == lastnum - 1) {
					System.out.print(i);
					break;
				}
				System.out.print(i + ",");
			}
		} else {
			System.out.println("첫번째 입력숫자는 반드시 두번째 입력숫자보다 작아야됩니다.");
		}

	}
}
