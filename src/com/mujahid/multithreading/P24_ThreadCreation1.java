package com.mujahid.multithreading;

//thread creation by implementing Runnable interface
class ThreadClass1 implements Runnable {
	public void run() {
		System.out.println("this is run method of thread:::ThreadClass1");
	}
}

//thread creation by extending thread class
class ThreadClass2 extends Thread {
	public void run() {
		System.out.println("this is run method of thread:::ThreadClass2");
	}
}

public class P24_ThreadCreation1 {

	public static void main(String[] args) {
		
		ThreadClass2 tc2 = new ThreadClass2();
		System.out.println( tc2.getPriority());
		tc2.setPriority(10);
		System.out.println( tc2.getPriority());
		tc2.start();
		System.out.println(tc2.getName());
		tc2.setName("tc2 thread");
		System.out.println("this thread name is set by me : "+tc2.getName());

		//thread creation by creating runnable object directly
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("this is run method of thread creation using Runnable");
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.setPriority(9);
		t1.start();
		
		Thread.currentThread().setPriority(1);
		System.out.println("this is main thread");
		
		ThreadClass1 tc1 = new ThreadClass1();
		Thread t2 = new Thread(tc1);
		t2.setPriority(8);
		t2.start();
		
		/*
		 * After starting a Thread we are not allowed to restart the same Thread once
		 * again otherwise we will get runtime exception saying
		 * "IllegalThreadStateException".
		 */
		//tc2.start(); 
		
		/*
		 * thread priority 1 to 10, default is 5,  highest is 10 which gets the max priority for the
		 * execution
		 * Main thread also has default priority
		 * child thread also has the same priority as parent thread
		 */
	
		

	}

}
