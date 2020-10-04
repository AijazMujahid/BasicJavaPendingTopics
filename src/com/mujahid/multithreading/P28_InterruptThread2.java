package com.mujahid.multithreading;

class P28_InterruptThread2Class extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
		{
		System.out.println("iam lazy thread");
		}
		System.out.println("I'm entered into sleeping stage");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			System.out.println("i got interrupted");
		}
	}
}

public class P28_InterruptThread2 {

	public static void main(String[] args) {

		P28_InterruptThread2Class t = new P28_InterruptThread2Class();
		t.start();
		t.interrupt();
		System.out.println("end of main thread");
	}

}
