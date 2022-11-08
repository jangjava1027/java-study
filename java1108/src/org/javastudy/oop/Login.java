package org.javastudy.oop;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		System.out.println("로그인");
		// 저장된 정보

		Scanner input = new Scanner(System.in);

		String userId = "m11";
		String userPw = "1111";

		while (true) {
			System.out.print("로그인하겠습니까?");
			String key = input.next();

			if (key.equals("n")) {
				System.out.print("종료합니다.");
				break;

			} else if (key.equals("y")) {
				System.out.print("아이디 입력: ");
				String id = input.next();

				System.out.print("비밀번호 입력: ");
				String pw = input.next();
				if (id.equals(userId) && pw.equals(userPw)) {
					System.out.println("로그인 성공! 즐거운 쇼핑되세요~");
					break;
				} else {
					System.out.println("로그인 실패. 다시 로그인 하세요.");
				}

			} else {
				System.out.println("입력오류. 다시 입력하세요.");
			}
		}

	}
}
