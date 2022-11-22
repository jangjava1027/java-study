package org.study.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		System.out.println("ArrayList");
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
			list1.add(new Integer(10));//0번지
			list1.add(new Integer(20));//1번지
			list1.add(new Integer(30));//2번지
			list1.add(new Integer(40));//3번지
			list1.add(new Integer(50));//4번지
			
			for(Integer el:list1) {
				System.out.print(el+" ");
			}
			System.out.println();
			Iterator<Integer> iter=list1.iterator();
			while(iter.hasNext()) {
				Integer el=iter.next();
				System.out.print(el+" ");
			}
			System.out.println();
			
			System.out.println(list1.size());
			System.out.println(list1.add(1000));
			list1.add(2, 1000);
//			list1.clear();
			System.out.println(list1.size());
			System.out.println(list1.get(0));
			System.out.println();
		
		
		
		
	}
}
