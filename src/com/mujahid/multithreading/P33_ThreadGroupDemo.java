package com.mujahid.multithreading;

public class P33_ThreadGroupDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup pg = new ThreadGroup("Parent Group");
		System.out.println(pg.getParent().getName());
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");
		System.out.println(cg.getParent().getName());
		
	}
}
