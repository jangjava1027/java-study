package org.study.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		System.out.println("for문");
		
		Vector<String> v0=new Vector<String>();
		v0.add(new String("user1"));
		v0.add(new String("user2"));
		v0.add(new String("user3"));
		v0.add(new String("user4"));
		v0.add(new String("user5"));
				
		//for문->모든 백터요소 출력
		for(int i=0;i<v0.size();i++) {
			System.out.print(v0.get(i)+" ");
		}
		System.out.println("\n");
		
		System.out.println("foreach문");
		//foreach문->모든 백터요소 출력
		for(String el: v0) {
			System.out.print(el+" ");
		}
		System.out.println("\n");
		
		System.out.println("Iterator문");
		//Iterator문
		
		Iterator<String> iter=v0.iterator();
		
		while(iter.hasNext()) {
			String el=iter.next();
			System.out.print(el+" ");
		}
		
		
		
		
		
		
		
		
		
	}
}
