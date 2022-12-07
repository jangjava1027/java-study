package org.project.commend;

import java.util.List;
import java.util.Scanner;

import org.project.dao.MemberDao;
import org.project.dto.Member1207Dto;

public class MemberselectAge implements MemberCommend {

	@Override
	public void excuteCommend() {
		System.out.println("나이조회");
		
		MemberDao dao = new MemberDao();

		Scanner input = new Scanner(System.in);
		System.out.print("처음나이: ");
		int startNum = input.nextInt();
		
		System.out.print("끝나이: ");		
		int endNum = input.nextInt();

		List<Member1207Dto> lists = dao.selectAge(startNum,endNum);

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


