package com.nokia;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExampl {
	
	static int count =0;
	
	 void  increment() {
		count = count+1;
	}
	 
	 public int getCount() {
		 return count;
	 }
	
	public static void main(String[] args) throws InterruptedException {
		TestExampl Test = new TestExampl();
		Thread T1 = new Thread() {
			public void run() {
				synchronized (this) {
					for(int i=0;i<10;i++) {
						System.out.println(Test.getCount());
					}
				}
				
			}
		};
		
		Thread T2 = new Thread() {
			public void run() {
				synchronized (this) {
					for(int i=0;i<10;i++) {
						System.out.println(Test.getCount()+2);
					}
				}
			}
		};
		
		T1.start();
		T2.start();
		
		
		
	}

}
