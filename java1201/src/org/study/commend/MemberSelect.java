package org.study.commend;

import java.util.ArrayList;

import org.study.dao.MemberDao;
import org.study.dto.MemberDto;

public class MemberSelect implements ExcuteCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원조회");
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> lists=dao.select();
//		for (MemberDto dto : dao.select()) {
//			System.out.println(dto.getUserId()+" "+dto.getUserPw()+" "+dto.getAge());
//		}
		if(lists!=null) {
			System.out.println("회원조회 Success");
			for(MemberDto list:lists) {
				System.out.println("아이디: "+list.getUserId()+" 비밀번호:  "+list.getUserPw()+" 나이: "+list.getAge());
			}
			
		}else {
			System.out.println("회원조회 fail");
		}
	}
}