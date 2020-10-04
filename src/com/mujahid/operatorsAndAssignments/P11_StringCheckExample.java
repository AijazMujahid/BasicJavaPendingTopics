package com.mujahid.operatorsAndAssignments;

public class P11_StringCheckExample {

	public static void main(String[] args) {
		
		String s1 = new String("mujahid");
		String s2 = new String("mujahid");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "mujahid";
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}

}
