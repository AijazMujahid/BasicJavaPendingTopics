package com.mujahid.multithreading;

public class P37_ThreadLocalDemo {

	public static void main(String[] args) {

		ThreadLocal tl = new ThreadLocal();
		System.out.println(tl.get());
		tl.set("Mujahid");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
		
		//overiding initialValue()
		ThreadLocal t2 = new ThreadLocal() {
			protected Object initialValue() {
				return "abc";
			}
		};
		System.out.println(t2.get());
		t2.set("Mujahid");
		System.out.println(t2.get());
		t2.remove();
		System.out.println(t2.get());

	}

}
