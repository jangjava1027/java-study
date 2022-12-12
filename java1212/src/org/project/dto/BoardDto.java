package org.project.dto;

import java.util.Date;

public class BoardDto {

	private int no;
	private String bTitle;
	private String bContent;
	private String nickname;//별칭
	private Date date;//날짜
	private String bWriterId;//글쓴이 -> 외래키(FK)
	
	public BoardDto(int no, String bTitle, String bContent, String nickname, Date date, String bWriterId) {
		super();
		this.no = no;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.date = date;
		this.nickname = nickname;
		this.bWriterId = bWriterId;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getbWriterId() {
		return bWriterId;
	}

	public void setbWriterId(String bWriterId) {
		this.bWriterId = bWriterId;
	}
	
	
	
	
	
}
