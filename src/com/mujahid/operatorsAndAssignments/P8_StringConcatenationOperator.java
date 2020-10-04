package com.mujahid.operatorsAndAssignments;

public class P8_StringConcatenationOperator {

	public static void main(String[] args) {

		/*
		 * If at least one String type variable is present in + operation and the other
		 * are of any number type, the result will be concatenation of the string
		 * 
		 * If all variables are of number type, then + operator acts as arithmetic operator
		 */  
		
		String a="ashok";
		int b=10 , c=20 , d=30 ;
		System.out.println(a+b+c+d); //output : ashok102030
		System.out.println(b+c+d+a); //output : 60ashok
		System.out.println(b+c+a+d); //output : 30ashok30
		System.out.println(b+a+c+d); //output : 10ashok 2030
		
	}

}
