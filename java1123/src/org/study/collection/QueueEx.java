package org.study.collection;

import java.util.LinkedList;

public class QueueEx {

	public static void main(String[] args) {
		
		LinkedList<String> qu=new LinkedList<>();
		qu.add("넷");
		qu.add("셋");
		qu.add("둘");
		qu.add("하나");
		//.peek() -> 매서드를 이용한 요소의 변환
		System.out.println(qu.peek());
		System.out.println(qu);
		//.pool() -> 매서드를 이용한 요소의 반환 및 제거
		System.out.println(qu.poll());
		System.out.println(qu);
		//.remove() -> 매서드를 이용한 요소의 제거
		qu.remove("하나");
		System.out.println(qu);
	}
}
