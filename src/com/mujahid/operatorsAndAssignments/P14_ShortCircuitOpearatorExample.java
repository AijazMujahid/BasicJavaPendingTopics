package com.mujahid.operatorsAndAssignments;

public class P14_ShortCircuitOpearatorExample {

	public static void main(String[] args) {

		int x=10 , y=15 ;
		if(++x < 10 || ++y > 15) { //instead of || using &,&&, |operators
		x++;
		}
		else {
		System.out.println("----"+y);
		y++;
		}
		System.out.println(x+"----"+y);
		
		int x1=10 ;
		if(++x1 < 10 && ((x1/0)>10) ) {
		System.out.println("Hello");
		}
		else {
		System.out.println("Hi");
		}

	}

}
