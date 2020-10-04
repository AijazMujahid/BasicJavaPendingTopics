package com.mujahid.multithreading;

class CustomerThread extends Thread {
	static Integer custID = 0;
	private static ThreadLocal tl = new ThreadLocal() {
		protected Integer initialValue() {
			return ++custID;
		}
	};
	
	CustomerThread(String name){
		super(name);
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" Executing with Customer ID: "+tl.get());
		}
	}
}

public class P38_ThreadLocalObject {

	public static void main(String[] args) {
		
		CustomerThread c1 = new CustomerThread("CustomerThread - 1");
		CustomerThread c2 = new CustomerThread("CustomerThread - 2");
		CustomerThread c3 = new CustomerThread("CustomerThread - 3");
		CustomerThread c4 = new CustomerThread("CustomerThread - 4");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();

	}

}
