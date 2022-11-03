package org.study.operatorEx;

import java.util.Scanner;

public class Operator6 {

	public static void main(String[] args) {
		System.out.println("조건 연산자");

		String userId = "m111";
		String userPw = "1111";
		// 조건 1 && 조건2-> 모든 조건이 true 일때만 true
		System.out.println(userId.equals("m111") || userPw.equals("1111"));
		System.out.println(userId.equals("m111") || userPw.equals("2222"));
		System.out.println(userId.equals("m222") || userPw.equals("1111"));
		System.out.println(userId.equals("m222") || userPw.equals("2222"));
		System.out.println("=============");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("=============");
		System.out.println(!false);
		System.out.println(!true);

		Scanner scn = new Scanner(System.in);
		System.out.print("아이디입력: ");
		String id = scn.next();

		System.out.print("비밀번호입력: ");
		String pw = scn.next();
		// 아이디가 틀리거나 비밀번호가 틀리거나
		if (!userId.equals(id) || !userPw.equals(pw)) {
			System.out.println("로그인 실패,아이디가 틀리거나, 비밀번호가 틀리거나, 둘다 틀리거나");
		} else {
			System.out.println("로그인 성공");
		}

	}

}
