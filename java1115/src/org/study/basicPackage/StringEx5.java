package org.study.basicPackage;

import java.util.Scanner;

import javax.management.Query;

public class StringEx5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean bool = true;
//		입력=/insert.do
//		입력=/update.do

		while (bool) {
			System.out.print("쿼리문 입력: ");
			String query = input.next();
			String str1 = query.substring(query.length() - 3);
			String str2 = query.substring(0, query.length() - 3);
			switch (str2) {
			case ".do":
				
			case "/insert":
				System.out.println("회원가입실행");
				break;
			case "/select":
				System.out.println("회원조회실행");
				break;
			case "/update":
				System.out.println("회원수정실행");
				break;
			case "/delete":
				System.out.println("회원탈퇴실행");
				break;
			default:
				System.out.println("입력값오류");
			}
			switch (str1) {
			case "exit":
				System.out.println("종료");

				bool = false;
				break;
			default:
				System.out.println("입력값 오류! 다시 입력하세요");
				break;
			}

		}

	}
}
