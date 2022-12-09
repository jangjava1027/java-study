package org.project.commend;

import java.util.Scanner;

import org.project.dao.MemberDao;

public class BoardWriteFK implements MemberCommend {

	@Override
	public void excuteCommend() {
		System.out.println("글 작성");
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.print("글제목: ");
		String bTitle=input.next();
		System.out.print("글내용: ");
		String bContent=input.next();
		System.out.print("작성자아이디: ");
		String bWriteId=input.next();
		
		MemberDao dao=new MemberDao();
		int result=dao.BoardwriteDo(bTitle,bContent,bWriteId);
		
		if(result!=0) {
			System.out.println("글 작성 Success");
		}else {
			System.out.println("글 작성 Fail");
		}
	}

}
