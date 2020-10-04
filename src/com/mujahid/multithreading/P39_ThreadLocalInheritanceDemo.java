package com.mujahid.multithreading;

class ParentThread extends Thread {
	public static InheritableThreadLocal itl = new InheritableThreadLocal() {
		public Object childValue(Object p) {
			return "cc";
		}
	};
	public void run() {
		itl.set("pp");
		System.out.println("Parent Thread --"+itl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
	class ChildThread extends Thread {
		public void run() {
			System.out.println("Child Thread --"+ParentThread.itl.get());
		}
	}
}

public class P39_ThreadLocalInheritanceDemo {

	public static void main(String[] args) {

		ParentThread pt = new ParentThread();
		pt.start();

	}

}

