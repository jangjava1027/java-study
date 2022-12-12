package org.project.commend;

import java.util.List;
import java.util.Scanner;

import org.project.dao.Dao;
import org.project.dto.MemberDto;

public class MemberInsertDo implements ExcuteCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원가입");
		Scanner input = new Scanner(System.in);

		System.out.print("아이디: ");
		String userId = input.next();
		System.out.print("비밀번호: ");
		String userPw = input.next();
		System.out.print("이메일: ");
		String email = input.next();

		// 싱글톤 패턴 -> 객체를 한번만 생성
		Dao dao = Dao.getInstance();

		int result = dao.insertDo(userId, userPw, email);

		if (result != 0) {
			System.out.println("회원가입 Success");

			List<MemberDto> dto = dao.select();

			if (dao != null) {
			
				for (MemberDto list : dto) {
					System.out.println(
							"아이디: " + list.getUserId() + " 비밀번호: " + list.getUserPw() + " 이메일: " + list.getEmail());
				}
				System.out.println("회원조회 Success");
			} else {
				System.out.println("회원조회 Fail");
			}
		} else {
			System.out.println("회원가입 Fail");

		}
	}

}
