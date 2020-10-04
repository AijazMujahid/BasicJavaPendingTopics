package com.mujahid.flowControl;

public class P20_WhileAndDoWhile {

	public static void main(String[] args) {

		/*
		 * for while loop 
		 * Every final variable will be replaced with the corresponding value by compiler. 
		 * If any operation involves only constants then compiler is responsible to perform that operation. 
		 * If any operation involves at least one variable compiler won't perform that operation. 
		 * At runtime jvm is responsible to perform that operation.
		 */
		
		/*
		 * do while loop :: If we want to execute loop body at least once then we should go
		 * for do-while. Curly braces are optional. Without curly braces we can take only
		 * one statement between do and while and it should not be declarative statement
		 */

		do
		{
		System.out.println("hello");
		}
		while(false);
		System.out.println("hi");
		
	}

}
