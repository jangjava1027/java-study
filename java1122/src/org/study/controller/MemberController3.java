package org.study.controller;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.study.dto.MemberDto;

public class MemberController3 {

	public static void main(String[] args) {

		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();

		lists.add(new MemberDto("m1", "11", "m1@gmail.com", 10));

		String userId = lists.get(0).getUserId();
		String userPw = lists.get(0).getUserPw();

		boolean key=true;
		
		Scanner input = new Scanner(System.in);
		while (key) {
			System.out.print("아이디 입력: ");
			String id = input.next();
			System.out.print("비밀번호 입력: ");
			String pw = input.next();

			if (userId.equals(id) && userPw.equals(pw)) {
				System.out.println("Login Success");
				key=false;
			} else {
				System.out.println("Login Fail, Retry->");
			}
		}
	}
}
