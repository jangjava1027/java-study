package org.study.dto;

public class MemberDto {

	private String userId;
	private String userPw;
	private int age;
	
	public MemberDto(String userId, String userPw, int age) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.age = age;

	}

	protected String getUserId() {
		return userId;
	}

	protected void setUserId(String userId) {
		this.userId = userId;
	}

	protected String getUserPw() {
		return userPw;
	}

	protected void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}
}
