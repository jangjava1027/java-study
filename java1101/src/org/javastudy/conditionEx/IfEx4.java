package org.javastudy.conditionEx;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		System.out.println("조건이 두개 일때");
		// 90점이상 A , 95점 이상이면 A+
		System.out.print("국어 점수 입력: ");
		Scanner input = new Scanner(System.in);
		int kor = input.nextInt();

		if (kor >= 90) {
			if (kor >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		}
		// 80이상 B, 85이상이면 B+
		if (kor >= 80) {
			if (kor >= 85)
				System.out.println("B+");
		} else {
			System.out.println("B");
		}
		// 70이상C, 75점이상이면 C+
		if (kor >= 70) {
			if (kor >= 75)
				System.out.println("C+");
		} else {
			System.out.println("c");
		}
		// 60이상D, 65이상이면D
		if (kor >= 60) {
			if (kor >= 65)
				System.out.println("D+");
		} else {
			System.out.println("D");
		}
		// 60미만 F
		if (kor < 60) {
			System.out.println("F");
		}
		System.out.println("프로그램 종료합니다.");
		input.close();

	}

}
