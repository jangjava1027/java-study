package org.study.commend_;

import java.util.ArrayList;

import org.study.dao_.MemberDao_;
import org.study.dto_.MemberDto_;

public class MemberSelectDo_ implements ExcuteQueryCommend_{

	@Override
	public void excuteCommend() {
		System.out.println("회원조회");
		
		MemberDao_ dao=new MemberDao_();
		ArrayList<MemberDto_> dto=dao.select();
		
		if(dto!=null) {
			for(MemberDto_ list:dto) {
				System.out.println("아이디: "+list.getUserId()+" 비밀번호: "+list.getUserPw()+" 나이: "+list.getAge()+" 이메일: "+list.getEmail());
			}
		}
	}

}
