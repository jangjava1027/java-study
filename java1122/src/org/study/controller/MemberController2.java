package org.study.controller;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.study.dto.MemberDto;

public class MemberController2 {

	public static void main(String[] args) {

		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		Scanner input = new Scanner(System.in);

		boolean key = true;

		while (key) {

			System.out.print("회원가입 종료하려면 exit입력->");
			String option = input.next();

			if (option.equals("exit")) {
				System.out.println("종료합니다.");
				key = false;
			} else {
				System.out.print("아이디 입력: ");
				String userId = input.next();

				System.out.print("비밀번호 입력: ");
				String userPw = input.next();

				System.out.print("이메일 입력: ");
				String email = input.next();

				System.out.print("나이 입력: ");
				int age = input.nextInt();

				System.out.println();


				lists.add(new MemberDto(userId, userPw, email, age));
			}

		}
		System.out.println("회원명단");
		for (MemberDto dto : lists) {
			System.out.print("아이디: " + dto.getUserId() + " ");
			System.out.print("비밀번호: " + dto.getUserPw() + " ");
			System.out.print("이메일: " + dto.getEmail() + " ");
			System.out.println("나이: " + dto.getAge());
		}


	}
}
