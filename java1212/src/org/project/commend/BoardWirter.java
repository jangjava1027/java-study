package org.project.commend;

import java.util.Scanner;

import org.project.dao.Dao;

public class BoardWirter implements ExcuteCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("게시글 작성");
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("글제목: ");
		String bTitle=input.next();
		System.out.print("글내용: ");
		String bContent=input.next();
		System.out.print("닉네임: ");
		String nickname=input.next();
		System.out.print("작성자: ");
		String bWriterId=input.next();
		
		Dao dao = Dao.getInstance();
		int result=dao.BoardDo(bTitle,bContent,nickname,bWriterId);
		
		if(result!=0) {
			System.out.println("게시글 작성 Success");
		}else {
			System.out.println("게시글 작성 Fail");
		}
	}

}
