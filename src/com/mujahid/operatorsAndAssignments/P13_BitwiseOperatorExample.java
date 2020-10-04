package com.mujahid.operatorsAndAssignments;

public class P13_BitwiseOperatorExample {

	public static void main(String[] args) {

//bitwise operator is applicable for boolean and integral types
System.out.println(true|true); //OR | if at least one argument is true. Then the result is true
System.out.println(true&true); //AND & If both arguments are true then only result is true.
System.out.println(true^true); //X-OR ^ (cap) if both are different arguments. Then the result is true

//bitwise complement ~ (tilde symbol) We can apply this operator only for integral types but not for boolean types.

int x = 24;
System.out.println(x);
System.out.println(~x);

	}

}
