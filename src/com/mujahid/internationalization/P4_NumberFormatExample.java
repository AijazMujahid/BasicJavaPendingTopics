package com.mujahid.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

//java number form into Italy specific form

public class P4_NumberFormatExample {

	public static void main(String[] args) {

		Locale l1 = Locale.UK;
		System.out.println(l1.getDisplayCountry());
		
		Locale l2 = Locale.getDefault();
		System.out.println(l2.getDisplayCountry());
		
		double d = 28734.3453;
		System.out.println(d);
		
		NumberFormat nf = NumberFormat.getNumberInstance(l1);
		String ukFormat = nf.format(d);
		System.out.println(ukFormat);
		
		
	}

}
