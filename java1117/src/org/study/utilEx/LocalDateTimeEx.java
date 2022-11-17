package org.study.utilEx;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		System.out.println("LocalDateTime");
		
		LocalDateTime ldate=LocalDateTime.now();//날짜
		LocalTime ltime=LocalTime.now();//시간
		
		int year=ldate.getYear();
		System.out.println(ldate.getYear());
		int month=ldate.getMonthValue();
		System.out.println(ldate.getMonthValue());
		int day=ldate.getDayOfYear();
		
		int hour=ltime.getHour();
		int minute=ltime.getMinute();
		int second=ltime.getSecond();
		
		System.out.println(year+"년"+month+"월"+day+"일"+hour+"시"+minute+"분"+second+"초");
		
		
	}
	
}
