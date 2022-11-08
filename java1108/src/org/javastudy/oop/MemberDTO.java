package org.javastudy.oop;

public class MemberDTO {

	private String userId;
	private String userPw;
	private String age;
	
	//Scanner 이용해서 회원가입 하고 회원가입 정보를 콘솔에 출력
	//아이디,비밀번호,나이를 입력하고 \
	//while(true),조건문(if)
	//"exit"입력되면 while문을 종료
	//"회원가입 하겠습니까?"
	//		실행->회원가입->회원출력
	//		실행하지 않으면->회원가입 종료
	
	//getters,setters
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserPw(String userPw) {
		this.userPw=userPw;
	}
	public String getUserPw() {
		return userPw;
	}	
	public void setAge(String age) {
		this.age=age;
	}
	public String getAge() {
		return age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
