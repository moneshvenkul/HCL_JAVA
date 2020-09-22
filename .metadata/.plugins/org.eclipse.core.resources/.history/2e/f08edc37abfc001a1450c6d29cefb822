package com.threads;

public class DemoThread implements Runnable {

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Running Child Thread in loop "+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
