package org.project.commend;

import java.util.ArrayList;

import org.project.dao.MemberDao;
import org.project.dto.Member1207Dto;

public class MemberSelect implements MemberCommend{

	@Override
	public void excuteCommend() {
		System.out.println("회원조회");
		
		MemberDao dao=new MemberDao();
		ArrayList<Member1207Dto> dto=dao.select();
		
		for(Member1207Dto list:dto) {
			System.out.println("아이디: "+list.getUserId()+" 비밀번호: "+list.getUserPw()+" 나이: "+list.getAge()+" 이메일: "+list.getEmail());
		}
	}

}
