package org.project.commend;

import java.util.Scanner;

import org.project.dao.Dao;

public class LoginDo implements ExcuteCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("로그인");
		
		Scanner input = new Scanner(System.in);

		System.out.print("아이디: ");
		String userId = input.next();
		System.out.print("비밀번호: ");
		String userPw = input.next();
		

		Dao dao = Dao.getInstance();

		int result = dao.loginDo(userId, userPw);
		
		if (result != 1) {
			System.out.println("로그인 Fail");
		} else {
			System.out.println("로그인 Success");
			
		}
	}

}
