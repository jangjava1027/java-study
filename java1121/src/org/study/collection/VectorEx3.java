package org.study.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx3 {

	public static void main(String[] args) {
		
		Vector<String> v0=new Vector<>();
		v0.add(new String("user1"));
		v0.add(new String("user2"));
		v0.add(new String("user3"));
		v0.add(new String("user4"));
		v0.add(new String("user5"));
		
		Iterator<String> iter=v0.iterator();
		
		while(iter.hasNext()) {
			String el=iter.next();
			System.out.print(el+" ");
		}
		
		System.out.println();
		
		Vector<MemberDTO> users=new Vector<MemberDTO>();
		
		users.add(new MemberDTO("m1", "1111", "s1", 10));//get(0)
		users.add(new MemberDTO("m2", "2222", "s2", 20));//get(1)
		users.add(new MemberDTO("m3", "3333", "s3", 30));//get(2)
		users.add(new MemberDTO("m4", "4444", "s4", 40));//get(3)
		users.add(new MemberDTO("m5", "5555", "s5", 50));//get(4)
		
//		System.out.println(users);
		
		System.out.println();
		//for문
		for(int i=0;i<users.size();i++) {
			System.out.print("아이디: "+users.get(i).getUserId()+" ");
			System.out.print("비밀번호: "+users.get(i).getUserPw()+" ");
			System.out.print("이름: "+users.get(i).getUserName()+" ");
			System.out.println("나이: "+users.get(i).getAge());
		}
		System.out.println();
		//foreach문
		for(MemberDTO el: users) {
			System.out.print("아이디: "+el.getUserId()+" ");
			System.out.print("비밀번호: "+el.getUserPw()+" ");
			System.out.print("이름: "+el.getUserName()+" ");
			System.out.println("나이: "+el.getAge());
			
		}
		System.out.println();
		//Iterator문
		Iterator<MemberDTO> iter1=users.iterator();
		
		while(iter1.hasNext()) {
			MemberDTO el=iter1.next();
			System.out.print("아이디: "+el.getUserId()+" ");
			System.out.print("비밀번호: "+el.getUserPw()+" ");
			System.out.print("이름: "+el.getUserName()+" ");
			System.out.println("나이: "+el.getAge());
		}
		
		
		
		
	}
}
