package com.mujahid.multithreading;

class P35_Thread extends Thread{

	P35_Thread(ThreadGroup g, String name) {
		super(g, name);
	}
	public void run() {
		System.out.println("Child Thread");
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {}
	}

}

public class P35_ThreadGroupMethods {
	
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");
		P35_Thread t1 = new P35_Thread(pg, "Child Thread 1");
		P35_Thread t2 = new P35_Thread(pg, "Child Thread 2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(5000);
		System.out.println(pg.activeCount());
		pg.list();
		}

}
