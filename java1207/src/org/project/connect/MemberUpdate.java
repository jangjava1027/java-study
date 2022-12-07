package org.project.connect;

import java.util.Scanner;

import org.project.commend.MemberCommend;
import org.project.dao.MemberDao;

public class MemberUpdate implements MemberCommend{

	@Override
	public void excuteCommend() {
		System.out.println("회원수정");
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("아이디: ");
		String userId=input.next();
		System.out.print("비밀번호: ");
		String userPw=input.next();
		System.out.print("나이: ");
		int age=input.nextInt();
		System.out.print("이메일: ");
		String email=input.next();
		
		MemberDao dao=new MemberDao();
		int result=dao.update(userId, userPw, age, email);
		
		if(result!=0) {
			System.out.println("회원수정 Success");
		}else {
			System.out.println("회원수정 Fail");
		}
	}

}
