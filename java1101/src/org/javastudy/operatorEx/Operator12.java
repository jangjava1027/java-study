package org.javastudy.operatorEx;

import java.util.Scanner;

public class Operator12 {

	public static void main(String[] args) {
		System.out.println("단항연산자");


		int i=10;
		System.out.println(i++); //선처리 후 증가
		System.out.println(i);
		System.out.println(++i);//선증가 후 처리
		System.out.println(i);
		System.out.println(i--);//선처리 후감소
		System.out.println(i);
		System.out.println(--i);//선감소 후처리

	}
}
