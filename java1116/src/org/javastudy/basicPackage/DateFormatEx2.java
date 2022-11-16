package org.javastudy.basicPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatEx2 {

	public static void main(String[] args) {
		System.out.println("DateFormat");

		Date now = new Date();
		System.out.println(now);

//		DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT, Locale.KOREA);
//		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
//		DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
//		DateFormat df=DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.KOREA);
		System.out.println(df.format(now));

		DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		System.out.println(df2.format(now));

	}
}
