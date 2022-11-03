package org.javastudy.loopEx;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {

		System.out.println("이중for문");
		System.out.println("구구단1");
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단입니다.");
			for (int j = 1; j < 10; j++) {
				// 2*1=2
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
		System.out.println();

		System.out.println("구구단2");
		// 9단부터2단까지 for문을 이용해서 구현
		for (int i = 9; i >= 2; i--) {
			System.out.println(i + "단입니다.");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

	}
}
