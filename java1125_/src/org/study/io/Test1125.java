package org.study.io;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test1125 {

	public static void main(String[] args) {
		//List순서가 있다.->구현객체 ArrayList
		List<Integer> list=new ArrayList<>();
		list.add(new Integer(10));
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		for(Integer i:list) {
			System.out.println(i);
		}
		//Set->주머니->중복불가능
		Set<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		System.out.println(set);
		
		Iterator<Integer>iter=set.iterator();
		while(iter.hasNext()) {
			Integer el=iter.next();
			System.out.println(el);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
