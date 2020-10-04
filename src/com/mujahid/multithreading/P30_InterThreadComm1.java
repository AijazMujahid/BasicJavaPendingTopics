package com.mujahid.multithreading;

/*In Interthread communication both threads has to be synchronized as to get lock on the objects and only then
we can call wait(), notify(), notifyAll() otherwise we would get IllegalMonitorStateException*/

class P30_InterThreadComm2 extends Thread{
	int total =0;
	public void run() {
		synchronized (this) {
			System.out.println("child thread starts calculation");
			for(int i=0;i<=100;i++)
			{
			total=total+i;
			}
			System.out.println("child thread giving notification call");
			this.notify();
		}
	}
}

public class P30_InterThreadComm1 {

	public static void main(String[] args) throws InterruptedException {

		P30_InterThreadComm2 t2 = new P30_InterThreadComm2();
		t2.start();
		synchronized (t2) {
			System.out.println("main thread caling wait() method");
			t2.wait();
			System.out.println("main thread got notification call");
			System.out.println(t2.total);
		}

	}

}
