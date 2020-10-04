package com.mujahid.operatorsAndAssignments;

public class P7_ArithmeticOperatorExample {

	public static void main(String[] args) {

		//way to represent infinity in double 
		System.out.println(10.0/0.0); //positive infinity
		System.out.println(-10.0/0.0); //negative infinity
		
		//NaN - Not a Number
		System.out.println(0.0/0.0); 
		System.out.println(-0.0/0.0); 
		
		int x=10;
		System.out.println(10 < Float.NaN ); // false
		System.out.println(10 <= Float.NaN ); // false
		System.out.println(10 > Float.NaN ); // false
		System.out.println(10 >= Float.NaN ); // false
		System.out.println(10 == Float.NaN ); // false
		System.out.println(Float.NaN == Float.NaN ); // false

		System.out.println(10 != Float.NaN ); //true
		System.out.println(Float.NaN != Float.NaN ); //true


	}

}
