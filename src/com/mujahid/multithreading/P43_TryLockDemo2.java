package com.mujahid.multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread43 extends Thread {
	static ReentrantLock l = new ReentrantLock();
	MyThread43(String name) {
		super(name);
	}
	public void run() {
		do {
			try {
				if(l.tryLock(1000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName()+"------- Got Lock");
					Thread.sleep(5000);
					l.unlock();
					System.out.println(Thread.currentThread().getName()+"------- Releases Lock");
					break;
				}
				else {
					System.out.println(Thread.currentThread().getName()+"------- Unable To Get Lock And Will Try Again");
				}
			}
			catch(InterruptedException e) {}
		}
		while(true);
	}
}


public class P43_TryLockDemo2 {

	public static void main(String[] args) {
		MyThread43 t1 = new MyThread43("First Thread");
		MyThread43 t2 = new MyThread43("Second Thread");
		t1.start();
		t2.start();

	}

}