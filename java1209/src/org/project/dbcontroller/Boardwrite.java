package org.project.dbcontroller;

import java.util.Scanner;

import org.project.commend.MemberCommend;
import org.project.dao.MemberDao;

public class Boardwrite implements MemberCommend {

	@Override
	public void excuteCommend() {
		System.out.println("게시글 작성");
		
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.print("작성자아이디: ");
		String writeId=input.next();
		System.out.print("글내용: ");
		String bContent=input.next();
		
		MemberDao dao=new MemberDao();
		int result=dao.BoardwriteDo(writeId,bContent);
		
		if(result!=0) {
			System.out.println("게시글 작성 Success");
		}else {
			System.out.println("게시글 작성 Fail");
		}
	}

}
