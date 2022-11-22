package org.study.controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.study.dto.MemberDto2;

public class MemberDto2Controller {

	public static void main(String[] args) {

		ArrayList<MemberDto2> dto = new ArrayList<>();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("회원가입 실행");

			System.out.print("아이디 입력: ");
			String userId = input.next();

			System.out.print("이메일 입력: ");
			String email = input.next();

			System.out.print("전화번호 입력: ");
			String phone = input.next();

			System.out.print("나이 입력: ");
			int age = input.nextInt();

			dto.add(new MemberDto2(userId, email, phone, age));

			System.out.println("회원명단");
			for (MemberDto2 user : dto) {
				System.out.print("아이디: " + user.getUserId() + " ");
				System.out.print("이메일: " + user.getEmail() + " ");
				System.out.print("전화번호: " + user.getPhone() + " ");
				System.out.println("나이: " + user.getAge());

				System.out.print("로그인 실행하려면 Login입력->");
				
				String option = input.next();
				if (option.equals("Login")) {
					System.out.println("로그인 실행");
					String userId1 = dto.get(0).getUserId();
					System.out.print("아이디 입력: ");
					String id = input.next();
					String email2 = dto.get(0).getEmail();
					System.out.print("이메일 입력: ");
					String em = input.next();

					if (userId1.equals(id) && email2.equals(em)) {
						System.out.println("로그인 성공");
					} else {
						System.out.println("로그인 실패");

					}
				}
			}

		}

	}
}
