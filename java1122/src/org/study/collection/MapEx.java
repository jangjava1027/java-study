package org.study.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		
		HashMap<String, String> map1=new HashMap<String, String>();
		 
		map1.put("가수1", "이모모");
		map1.put("가수1", "강모모");
		map1.put("가수2", "나모모");
		map1.put("가수3", "박모모");
		map1.put("가수4", "김모모");
		map1.put("가수5", "김모모");
		System.out.println(map1);
		System.out.println(map1.get("가수1"));
		System.out.println(map1.get("가수2"));
		
		//1. keySet() -> key를 set(key는 중복되지 않는다.)
		Set<String> set=map1.keySet();//키값을 저장
		//2. 출력Iterator
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()) {
			String key=iter.next();
			String val=map1.get(key);//key값을 이용해서 value를 get
			System.out.println("키: "+key+"값: "+val);
		}
		
		
		
		
		
		
		
		
		
	}
}
