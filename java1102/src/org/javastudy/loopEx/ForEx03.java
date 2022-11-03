package org.javastudy.loopEx;

import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {

		System.out.println("for문");
		// Scanner이용해서, 시작단,끝단-> 2단, 5단 2~5
		// 시작단 ,끝단을 입력을 받아서 콘솔에 출력하시오
		// 단 , 시작단은 끝단보다 작다.
		// for문으로 구현

		Scanner input = new Scanner(System.in);

		System.out.print("시작단: ");
		int num1 = input.nextInt();

		System.out.print("끝단");
		int num2 = input.nextInt();

		if (num1 < num2) {
			
			for (int i = num1; i <= num2; i++) {
				System.out.println(i + "단");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}

			}
		} else {
			System.out.println("시작단은 끝단보다 작아야합니다.");
		}

	}

}
