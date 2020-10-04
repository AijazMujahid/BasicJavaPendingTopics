package com.mujahid.multithreading;

class ClassThreadTest1 extends Thread {
	public void run() {
		for(int i=0;i<5;i++)
		{
		System.out.println("Juliet Thread");
		try
		{
		Thread.sleep(2000);
		}
		catch (InterruptedException e){
			e.printStackTrace();
			}
		}
	}
}

public class P25_TreadMethods {

	public static void main(String[] args) throws InterruptedException {

		// yield(), join() & sleep()
	//yield pause the thread execution and gives the other thread with the same priority a chance to execute 
	//join allows the thread to complete it execution
		
		ClassThreadTest1 ctt1 = new ClassThreadTest1();
		ctt1.start();
	//	ctt1.yield();
	//	ctt1.join();
		for(int i=0;i<5;i++)
		{
		System.out.println("Romeo Thread");
		}

	}

}
