package com.mujahid.multithreading;

import java.util.concurrent.locks.ReentrantLock;
class MyThread42 extends Thread {
	static ReentrantLock l = new ReentrantLock();
	MyThread42(String name) {
		super(name);
	}
	public void run() {
		if(l.tryLock()) {
			System.out.println(Thread.currentThread().getName()+" Got Lock and Performing Safe Operations");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
			l.unlock();
		}
		else {
			System.out.println(Thread.currentThread().getName()+" Unable To Get Lock "
					+ "and Hence Performing Alternative Operations");
		}
	}
}

public class P42_TryLockDemo {

	public static void main(String[] args) {

		MyThread42 t1 = new MyThread42("First Thread");
		MyThread42 t2 = new MyThread42("Second Thread");
		t1.start();
		t2.start();

	}

}
