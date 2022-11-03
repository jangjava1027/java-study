package org.javastudy.conditionEx;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		System.out.println("기말고사 평균 계산 프로그램");

		Scanner input = new Scanner(System.in);
		System.out.print("국어점수 입력: ");
		int kor = input.nextInt();

		System.out.print("수학점수 입력: ");
		int math = input.nextInt();

		System.out.print("영어점수 입력: ");
		int eng = input.nextInt();

		int sum = kor + math + eng;
		int avg = sum / 3;

		String jumsu = "";

		if (avg >= 90) {
			jumsu = "A";
			System.out.println("A");
		} else if (avg >= 80) {
			jumsu = "B";
			System.out.println("B");
		} else if (avg >= 70) {
			jumsu = "C";
			System.out.println("C");
		} else if (avg >= 60) {
			jumsu = "D";
			System.out.println("D");
		} else {
			jumsu = "F";
			System.out.println("F");
		}

		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("학점: " + jumsu);

	}

}
