package com.mujahid.multithreading;

class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<5;i++)
		{
			System.out.print("good morning:");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{}
			System.out.println(name);
		}
	}
}

class P29_SynchronizedDemoThreadClass extends Thread{

	Display d;
	String name;
	P29_SynchronizedDemoThreadClass(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}

public class P29_SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1 = new Display();
		P29_SynchronizedDemoThreadClass t1 = new P29_SynchronizedDemoThreadClass(d1,"aijaz");
		P29_SynchronizedDemoThreadClass t2 = new P29_SynchronizedDemoThreadClass(d1,"mujahid");
		t1.start();
		t2.start();

	}

}
