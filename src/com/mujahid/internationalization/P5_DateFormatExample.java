package com.mujahid.internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class P5_DateFormatExample {

	public static void main(String[] args) {

		System.out.println(DateFormat.getDateInstance(0).format(new Date()));
		
		System.out.println(DateFormat.getDateInstance(1).format(new Date()));
		
		System.out.println(DateFormat.getDateInstance(2).format(new Date()));
		
		System.out.println(DateFormat.getDateInstance(3).format(new Date()));
		
		DateFormat UKDate = DateFormat.getDateInstance(0, Locale.UK);
		System.out.println("UK DateFormat : "+UKDate.format(new Date()));

		DateFormat ItalyDate1 = DateFormat.getDateInstance(0, Locale.ITALY);
		System.out.println("Italy Date Format : "+ItalyDate1.format(new Date()));
		DateFormat ItalyDate2 = DateFormat.getDateTimeInstance(0, 0, Locale.ITALY);
		System.out.println("Italy Date time format : "+ItalyDate2.format(new Date()));
		
		DateFormat ChinaDate = DateFormat.getDateInstance(0, Locale.CHINA);
		System.out.println("China Date Format : "+ChinaDate.format(new Date()));
	}

}
