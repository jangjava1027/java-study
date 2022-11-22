package org.study.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx {

	public static void main(String[] args) {
		
		System.out.println("Set");
		
		HashSet<String> set=new HashSet<>();
		
		set.add("JAVA");
		set.add("JAVA");
		set.add("DATABASE");
		set.add("WEB");
		set.add("SERVELT");
		set.add("JSP");
		set.add("SPRING");
		
		int size=set.size();
		System.out.println("총 객체 수: "+size);
		System.out.println(set);
		set.remove("JAVA");
		
		size=set.size();
		System.out.println("총 객체 수: "+size);
		
		System.out.println(set);
		
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()) {
			String el=iter.next();
			System.out.println(el);
		}
		
		set.clear();//set요소 삭제
		size=set.size();
		System.out.println("총 객체 수: "+size);
		if(set.isEmpty()) {
			System.out.println("set은 비어있다.");
		}
		
		
	}
}
