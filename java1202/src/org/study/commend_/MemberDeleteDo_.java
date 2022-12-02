package org.study.commend_;

import java.util.Scanner;

import org.study.dao_.MemberDao_;

public class MemberDeleteDo_ implements ExcuteQueryCommend_{

	@Override
	public void excuteCommend() {
		System.out.println("회원탈퇴");
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("아이디: ");
		String userId=input.next();
		System.out.print("비밀번호: ");
		String userPw=input.next();
		System.out.print("나이: ");
		int age=input.nextInt();
		System.out.print("이메일: ");
		String email=input.next();
		
		MemberDao_ dao=new MemberDao_();
		
		int result=dao.delete(userId, userPw, age, email);
		
		if(result!=0) {
			System.out.println("회원탈퇴 Success");
		}else {
			System.out.println("회원탈퇴 fail");
		}
	}

}
