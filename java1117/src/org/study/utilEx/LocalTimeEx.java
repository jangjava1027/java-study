package org.study.utilEx;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeEx {

	public static void main(String[] args) {
		System.out.println("LocalTime");
		
		LocalTime ltime=LocalTime.now();
		System.out.println(ltime);
		
		System.out.println(ltime.getHour());
		System.out.println(ltime.getMinute());
		System.out.println(ltime.getSecond());
		System.out.println(ltime.getNano());

		LocalTime ltime2=LocalTime.of(10, 30, 20);//임의의 시간 설정
		System.out.println(ltime2);
		System.out.println(ltime2.getHour());
		System.out.println(ltime2.getMinute());
		System.out.println(ltime2.getSecond());
		
	}
}
