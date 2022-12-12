package org.project.commend;

import java.util.List;

import org.project.dao.Dao;
import org.project.dto.MemberDto;

public class MemberSelectDo implements ExcuteCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원조회");

		Dao dao = Dao.getInstance();
		List<MemberDto> dto = dao.select();

		if (dao != null) {
			for (MemberDto list : dto) {
				
				System.out.println(
						"아이디: " + list.getUserId() + " 비밀번호: " + list.getUserPw() + " 이메일: " + list.getEmail());
			}
			System.out.println("회원조회 Success");
		} else {
			System.out.println("회원조회 Fail");
		}

	}

}
