package org.project.commend;

import java.util.List;
import java.util.Scanner;

import org.project.dao.MemberDao;
import org.project.dto.Member1207Dto;

public class MemberSearchIdDo implements MemberCommend {

	@Override
	public void excuteCommend() {
		System.out.println("검색");

		MemberDao dao = new MemberDao();

		Scanner input = new Scanner(System.in);
		System.out.print("검색아이디: ");

		String userId = input.next();

		List<Member1207Dto> lists = dao.searchId(userId);

		if (lists != null) {
			System.out.println("회원조회 Success");

			for (Member1207Dto list : lists) {
				System.out.println("아이디: " + list.getUserId() + " 비밀번호: " + list.getUserPw() + " 나이: " + list.getAge()
						+ " 이메일: " + list.getEmail());
			}
		} else {
			System.out.println("회원조회 Fail");

		}
	}
}
