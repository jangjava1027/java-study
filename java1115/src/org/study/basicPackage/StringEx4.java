package org.study.basicPackage;

import java.util.Scanner;

import javax.management.Query;

public class StringEx4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

//		입력=/insert.do
//		입력=/update.do

		while (true) {
			System.out.print("쿼리문 입력: ");
			String query = input.next();
			String str = query.substring(query.length() - 3);
			if (str.equals(".do")) {
				if (query.substring(0, query.length() - 3).equals("/insert")) {
					System.out.println("회원가입실행");
				} else if (query.substring(0, query.length() - 3).equals("/update")) {
					System.out.println("회원수정실행");
				} else if (query.substring(0, query.length() - 3).equals("/select")) {
					System.out.println("회원조회실행");
				} else if (query.substring(0, query.length() - 3).equals("/delete")) {
					System.out.println("회원탈퇴실행");
				} else {
					System.out.println("입력값오류");
				}
			} else if (query.equals("exit")) {
				System.out.println("죵료");
				break;
			} else {
				System.out.println("입력값오류!다시입력하세요");
			}

		}

	}
}
