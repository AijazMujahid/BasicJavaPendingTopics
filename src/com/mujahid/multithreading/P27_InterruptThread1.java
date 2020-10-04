package com.mujahid.multithreading;

class P27_ThreadClass extends Thread{
	public void run() {
		try {
			for(int i=0;i<5;i++)
			{
			System.out.println("i am lazy Thread :"+i);
			Thread.sleep(2000);
			}
		}catch(InterruptedException e) {
			System.out.println("i got interrupted");
		}
	}
}

public class P27_InterruptThread1 {

	public static void main(String[] args) {

		P27_ThreadClass t = new P27_ThreadClass();
		t.start();

		t.interrupt();
		System.out.println("end of main thread");
	}

}
