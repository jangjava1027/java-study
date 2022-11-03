package org.javastudy.loopEx;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		System.out.println("while");

		System.out.println("구구단 ");
		// Scanner이용해서, 시작단,끝단-> 2단, 5단 2~5
		// 시작단 ,끝단을 입력을 받아서 콘솔에 출력하시오
		// 단 , 시작단은 끝단보다 작다.
		// while으로 구현
		Scanner input = new Scanner(System.in);
		System.out.println("시작단 입력: ");
		int num1 = input.nextInt();

		System.out.println("끝단 입력: ");
		int num2 = input.nextInt();

		int i = num1;
		while (i <= num2) {
			System.out.println(i + "단입니다.");

			int j = 1;
			while (j < 10) {
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;
			}

			i++;
		}

	}
}
