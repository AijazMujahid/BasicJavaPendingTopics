package com.mujahid.operatorsAndAssignments;

class Student1{
	private String name;
	Student1(String name){
		this.name = name;
	}
}

public class P12_InstanceofOperator {

	public static void main(String[] args) {
		
		Student1 s1 = new Student1("mujahid");
		Student1 s2 = new Student1("mujahid");
		
		System.out.println(s1 instanceof Student1);

		Object obj = new Object();
		System.out.println(obj instanceof Student1);
		
		System.out.println(s1==obj);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}

}
