package org.study.jdbc;

import java.util.ArrayList;
import java.util.List;

class User{
	
	private String userId;
	private String userPw;
	private int age;
	
	public User(String userId, String userPw, int age) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.age = age;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Test1202 {

	public static void main(String[] args) {
		
		ArrayList<User>users=new ArrayList<User>();
		
		users.add(new User("m1", "11", 11));
		users.add(new User("m2", "22", 22));
		users.add(new User("m3", "33", 33));
		users.add(new User("m4", "44", 44));
		users.add(new User("m5", "55", 55));
		
		for(User user:users) {
			System.out.println("id: "+user.getUserId()+" pw: "+user.getUserPw()+" age: "+user.getAge());
		}
		
		
		System.out.println();
		
		List<Integer> lists1=new ArrayList<>();
		ArrayList<Integer> lists2= new ArrayList<Integer>();
		//list에 추가
		lists1.add(new Integer(10));
		lists1.add(new Integer(20));
		lists1.add(new Integer(30));
		lists1.add(new Integer(40));
		lists1.add(new Integer(50));
		//list에 출력
		System.out.print(lists1.get(0)+" ");
		System.out.print(lists1.get(1)+" ");
		System.out.print(lists1.get(2)+" ");
		System.out.print(lists1.get(3)+" ");
		System.out.print(lists1.get(4)+" ");
		System.out.println();
		//for
		for(int i=0;i<lists1.size();i++) {
			System.out.print(lists1.get(i)+" ");
		}
		System.out.println();
		//foreach -> List요소를 출력
		for(Integer list:lists1) {
			System.out.print(list+" ");
		}
		
	}
}
