package com.mujahid.internationalization;

import java.util.Locale;

public class P3_LocaleDemo1 {

	public static void main(String[] args) {

		Locale l1 = Locale.getDefault();
		
		System.out.println(l1.getCountry()+".........."+l1.getLanguage());
		
		System.out.println(l1.getDisplayCountry()+"....."+l1.getDisplayLanguage());
		Locale l2=new Locale ("pa","IN") ;

		Locale. setDefault (l2) ;
		
		String[] s3 = Locale.getISOLanguages();
		for(String s4:s3) {
			System.out.print(s4+" ");
		}
		System.out.println(" ");
		String[] s5 = Locale.getISOCountries();
		for(String s6:s5) {
			System.out.print(s6+" ");
		}
		
		Locale[] ls = Locale.getAvailableLocales();
		for(Locale ls1 : ls) {
			System.out.println(ls1.getDisplayCountry()+"...."+ls1.getDisplayLanguage());
		}

	}

}
