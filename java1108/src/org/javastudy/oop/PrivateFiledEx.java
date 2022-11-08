package org.javastudy.oop;

public class PrivateFiledEx {

	private String userId;
	private String userPw;
	private int userAge;
	public String addr;
	
	//setters,getters
	//setter->private 필드를 외부에 초기화 메소드
	public void setUserId(String userId) {
		
		//필드    ==매개변수(외부입력)
		this.userId=userId;
	}
	//getter->private 필드를 외부에 호출 메소드
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserPw(String userPw) {
		this.userPw=userPw;
	}
	public String getUserPw() {
		return this.userPw;
	}
	public void setUserAge(int userAge) {
		this.userAge=userAge;
	}
	public int getUserAge() {
		return this.userAge;
	}
	
	
	
	
	
	
}
