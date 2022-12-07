package org.project.commend;

import java.util.List;
import java.util.Scanner;

import org.project.dao.MemberDao;
import org.project.dto.Member1207Dto;

public class MemberSort implements MemberCommend {

	@Override
	public void excuteCommend() {
		System.out.println("정렬");
		//아이디별로 내림차순
		
		MemberDao dao = new MemberDao();
		
		// 필드1, 정렬2

		Scanner input = new Scanner(System.in);
		System.out.print("정렬방식(DESC,ASC): ");
		String sortmethod=input.next();
		
		List<Member1207Dto>lists=dao.sort(sortmethod);
		
		if(lists!=null) {
			System.out.println("정렬 Success");

			for (Member1207Dto list : lists) {
				System.out.println("아이디: " + list.getUserId() + " 비밀번호: " + list.getUserPw() + " 나이: " + list.getAge()
						+ " 이메일: " + list.getEmail());
			}
		} else {
			System.out.println("정렬 Fail");

		}
		
	}

}
