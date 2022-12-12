package org.project.commend;

import java.util.List;
import java.util.Scanner;

import org.project.dao.Dao;
import org.project.dto.BoardDto;

public class BoardId_list implements ExcuteCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("특정아이디의 게시글 리스트");

		Scanner input = new Scanner(System.in);

		System.out.print("조회할 게시글의 작성자: ");
		String userId = input.next();

		Dao dao = Dao.getInstance();

		List<BoardDto> dto = dao.boardIdDo(userId);

		if (dao != null) {
			System.out.println("회원조회 Success");
			for (BoardDto list : dto) {

				System.out.println("글번호: " + list.getNo() + " 글제목: " + list.getbTitle() + " 글내용: " + list.getbContent()+ " 닉네임: "+list.getNickname()
						+ " 작성날짜: " + list.getDate() +  " 작성자: " + list.getbWriterId());
			}
		} else {
			System.out.println("회원조회 Fail");
		}
	}
}
