package com.mujahid.operatorsAndAssignments;

public class P6_IncrementDecrementOperators {

	public static void main(String[] args) {

	//increment/decrement operators can be applied only for variables 
		
		int x = 10;
		
		int y = ++x;
		
	//	int z = 10++; // increment/decrement operators are not applicable for constant values
		
	//	int y1 = ++(++x); //nesting of increment/decrement is not allowed
		
		final int x1 = 20;		
	//	x1++; //increment/decrement not applicable for final variables
		
		//difference between b++ & b=b+1
		byte b=10;
		b++; //--------type casting automatically happens
		System.out.println(b);
		
		byte b1=20;
		b1 = (byte) (b1 + 1); //--------explicitly we have to type cast 

	}

}
