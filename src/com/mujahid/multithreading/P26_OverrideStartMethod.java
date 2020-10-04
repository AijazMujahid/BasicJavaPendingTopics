package com.mujahid.multithreading;

class MyThread1 extends Thread {
	//override start method
	public void start() {
		super.start();
		System.out.println("this is OverrideStartMethod");
	}
	
	public void run() {
		System.out.println("this is run method");
	}
}

public class P26_OverrideStartMethod {

	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
		t1.start();
		//we can't call start method twice 
		//t1.start(); // we get RE : IllegalThreadStateException
		
		//run method can be called number of times as a normal method call
		t1.run();
		t1.run();
		
		System.out.println("this is main thread");
		
	}

}
