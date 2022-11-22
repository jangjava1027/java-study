package org.study.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<Integer> v0=new Vector<Integer>();
		
//		Integer i1=new Integer(10);
//		Integer i2=new Integer(20);
//		Integer i3=new Integer(30);
//		Integer i4=new Integer(40);
//		Integer i5=new Integer(50);
		
		v0.add(new Integer(10));
		v0.add(new Integer(20));
		v0.add(new Integer(30));
		v0.add(new Integer(40));
		v0.add(new Integer(50));
		
		for(Integer i:v0) {
			System.out.println(i);
		}
		
		System.out.println("=============");
		Vector<MemberDTO> users=new Vector<MemberDTO>();
		
//		MemberDTO user1=new MemberDTO("m1", "1111", "s111", 11);
//		MemberDTO user2=new MemberDTO("m2", "2222", "s211", 21);
//		MemberDTO user3=new MemberDTO("m3", "3333", "s311", 31);
//		MemberDTO user4=new MemberDTO("m4", "4444", "s411", 41);
//		MemberDTO user5=new MemberDTO("m5", "5555", "s511", 51);
		
		users.add(new MemberDTO("m1", "1111", "s111", 11));
		users.add(new MemberDTO("m2", "2222", "s211", 21));
		users.add(new MemberDTO("m3", "3333", "s311", 31));
		users.add(new MemberDTO("m4", "4444", "s411", 41));
		users.add(new MemberDTO("m5", "5555", "s511", 51));
		
		for(int i=0;i<users.size();i++) {
			System.out.print("아이디: "+users.get(i).getUserId()+" ");
			System.out.print("비밀번호: "+users.get(i).getUserPw()+" ");
			System.out.print("이름: "+users.get(i).getUserName()+" ");
			System.out.println("나이: "+users.get(i).getAge());
		}
		System.out.println();
		
		for(MemberDTO user:users) {
		System.out.print("아이디: "+user.getUserId()+" ");
		System.out.print("비밀번호: "+user.getUserPw()+" ");
		System.out.print("이름: "+user.getUserName()+" ");
		System.out.println("나이: "+user.getAge());
		}
		System.out.println();
		
		Iterator<MemberDTO> iter=users.iterator();
		while(iter.hasNext()) {
			MemberDTO i=iter.next();
			System.out.print("아이디: "+i.getUserId()+" ");
			System.out.print("비밀번호: "+i.getUserPw()+" ");
			System.out.print("이름: "+i.getUserName()+" ");
			System.out.println("나이: "+i.getAge());
			
		}
		
		
		
		
		
		
	}
}
