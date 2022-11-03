package org.javastudy.conditionEx;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		System.out.println("조건이 하나 일때");
		// 아이디,비밀번호 입력받아서
		// 아이디와 비밀번호가 일치하면 로그인 성공
		// 하나라도 틀리면 로그인 실패 콘솔에 출력
		// &&
		String id = "m111";
		String pw = "1111";

		Scanner input = new Scanner(System.in);
		System.out.println("아이디 입력: ");
		String userId = input.next();

		System.out.println("비밀번호 입력: ");
		String userPw = input.next();

		if (userId.equals(id) && userPw.equals(pw)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

//		if(!userId.equals(id) && !userPw.equals(pw)) {
//			System.out.println("로그인 실패");
//		}else {
//			System.out.println("로그인 성공");
//		}

		System.out.println("프로그램 종료합니다.");
		input.close();

	}

}
