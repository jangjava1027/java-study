package org.study.collection;

public class GStackMain {

	public static void main(String[] args) {

		GStack<Integer> gstack1 = new GStack<Integer>();

		int size = gstack1.oStack.length;// 배열의 전체길이
		// push매서드 10번 실행
		for (int i = 0; i < 10; i++) {
			// 10~100
			int i2 = i * 10 + 10;
			gstack1.push(i2);
			System.out.println(gstack1.oStack[i]);
		}
		System.out.println("=====================");
		// pop매서드 이용해서 모든 oStack의 배열요소를 콘솔에 출력
		for (int i = 0; i < size; i++) {
			System.out.println("gstack1.oStack[" + gstack1.idx + "]=");
			System.out.println(gstack1.pop());
		}
	}

}
