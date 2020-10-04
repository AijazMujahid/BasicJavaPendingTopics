package com.mujahid.operatorsAndAssignments;

public class P10_EqualityOperatorExample {

	public static void main(String[] args) {

		/*
		 * equality operator can be applied for object types as well 
		 * For object references r1 and r2 , r1 == r2 returns true if and only if both r1 and r2
		 * pointing to the same object. i.e., == operator meant for
		 * reference-comparision Or address-comparision.
		 */
		
		/*To use the equality operators between object type compulsory these should be
		some relation between argument types(child to parent , parent to child) ,
		Otherwise we will get Compiletime error incompatible types*/
		
		Thread t=new Thread();
		Object o=new Object( );
		String s=new String("mujahid");
		System.out.println(t ==o); //false
		System.out.println(o==s); //false
	//	System.out.println(s==t);
	//	CE : incompatible types : java.lang.String and java.lang.Thread
		
		
	}

}
