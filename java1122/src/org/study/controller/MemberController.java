package org.study.controller;

import java.util.ArrayList;
import java.util.Iterator;

import org.study.dto.MemberDto;

public class MemberController {

	public static void main(String[] args) {
		
		ArrayList<MemberDto> lists=new ArrayList<MemberDto>();
		
		lists.add(new MemberDto("m111", "1111", "m111.@gmail.com", 11));
		lists.add(new MemberDto("m112", "1112", "m112.@gmail.com", 21));
		lists.add(new MemberDto("m113", "1113", "m113.@gmail.com", 31));
		lists.add(new MemberDto("m114", "1114", "m114.@gmail.com", 41));
		lists.add(new MemberDto("m115", "1115", "m115.@gmail.com", 51));
		
		for(int i=0;i<lists.size();i++) {
			System.out.print("아이디: "+lists.get(i).getUserId()+" ");
			System.out.print("비밀번호: "+lists.get(i).getUserPw()+" ");
			System.out.print("이메일: "+lists.get(i).getEmail()+" ");
			System.out.println("나이: "+lists.get(i).getAge());
		}
		System.out.println();
		
		for(MemberDto list:lists) {
			System.out.print("아이디: "+list.getUserId()+" ");
			System.out.print("비밀번호: "+list.getUserPw()+" ");
			System.out.print("이메일: "+list.getEmail()+" ");
			System.out.println("나이: "+list.getAge());
		}
		System.out.println();
		
		Iterator<MemberDto> iter=lists.iterator();
		while(iter.hasNext()) {
			MemberDto list=iter.next();
			System.out.print("아이디: "+list.getUserId()+" ");
			System.out.print("비밀번호: "+list.getUserPw()+" ");
			System.out.print("이메일: "+list.getEmail()+" ");
			System.out.println("나이: "+list.getAge());
		}
		
		
		
	}
}
