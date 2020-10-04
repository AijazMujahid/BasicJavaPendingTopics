package com.mujahid.multithreading;

class P32_DaemonThreadClass extends Thread {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("lazy thread");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{}
		}
	}
}

public class P32_DaemonThreadDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().isDaemon());
		P32_DaemonThreadClass t=new P32_DaemonThreadClass();
		System.out.println(t.isDaemon()); 
		//t.start();
		//t.setDaemon(true);
		t.start();
		System.out.println(t.isDaemon());

	}

}
