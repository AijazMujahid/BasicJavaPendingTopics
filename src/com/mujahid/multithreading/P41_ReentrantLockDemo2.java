package com.mujahid.multithreading;

import java.util.concurrent.locks.ReentrantLock;

class Display1 {
	ReentrantLock l = new ReentrantLock(true);
	public void wish(String name) {
	//	l.lock();// 1
		for(int i=0; i<5; i++) {
			System.out.println("Good Morning ");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
			System.out.println(name);
		}
	//	l.unlock();// 2
	}
}
class MyThread extends Thread {
	Display1 d;
	String name;
	MyThread(Display1 d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}


public class P41_ReentrantLockDemo2 {

	public static void main(String[] args) {

		Display1 d = new Display1();
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Yuva Raj");
		MyThread t3 = new MyThread(d, "ViratKohli");
		t1.start();
		t2.start();
		t3.start();

	}

}