package com.mujahid.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {
	String name;
	PrintJob(String name){
		this.name = name;
	}
	
	public void run() {
		System.out.println(name+"....Job Started By Thread:" +Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			System.out.println(name+"....Job Completed By Thread:" +Thread.currentThread().getName());
		}
	}
}

public class P44_ThreadPool_Executor_Demo {

	public static void main(String[] args) {

		PrintJob[] jobs = {
				new PrintJob("Aijaz Mujahid"),
				new PrintJob("Asra Naaz"),
				new PrintJob("Saira"),
				new PrintJob("Saif"),
				new PrintJob("Zoya"),
		};
		
		ExecutorService service1 = Executors.newFixedThreadPool(2);
		for(PrintJob job : jobs) {
			service1.submit(job);
		}
		service1.shutdown();
	}

}
