package org.study.utilEx;

import java.time.LocalDateTime;

public class LocalEx1 {

	public static void main(String[] args) {
		//날짜조절
		//.plus~ ,.minus~
		//LocalTime,LocalDatetime,ZonedDateTime
		//클래스는 각각 시간,분,초,나노초를 더하거나 뺄수있다.
		
		LocalDateTime curDateTime=LocalDateTime.now();
		LocalDateTime tarDateTime=curDateTime.plusYears(11);
		System.out.println("현재날짜시간: "+curDateTime);
		System.out.println(tarDateTime);
		
		tarDateTime=curDateTime.plusMonths(5);//월 더하기
		System.out.println(tarDateTime);
		
		tarDateTime=curDateTime.minusMonths(5);//월 빼기
		System.out.println(tarDateTime);
		
		tarDateTime=curDateTime.plusDays(11);//일 더하기
		System.out.println(tarDateTime);
		
		tarDateTime=curDateTime.minusDays(11);//일 빼기
		System.out.println(tarDateTime);
		
		tarDateTime=curDateTime.plusWeeks(11);//주 더하기
		System.out.println(tarDateTime);
		
		tarDateTime=curDateTime.minusWeeks(11);//주 빼기
		System.out.println(tarDateTime);
		
		
		
		
		
		
		
		
		
	}
}
