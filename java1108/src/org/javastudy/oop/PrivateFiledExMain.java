package org.javastudy.oop;

public class PrivateFiledExMain {

	public static void main(String[] args) {
		
		
		PrivateFiledEx ins1=new PrivateFiledEx();
		
		ins1.addr="서울시 노원구 상계동";
				
		ins1.setUserId("m111");
		String userId=ins1.getUserId();
		System.out.println(userId);
			
		ins1.setUserPw("1111");
		String userPw=ins1.getUserPw();
		System.out.println(userPw);
				
		ins1.setUserAge(20);
		int userAge=ins1.getUserAge();
		System.out.println(userAge);
				
		
		
		
		
		
	}
	
	
	
}
