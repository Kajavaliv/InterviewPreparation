package com.test;

public class DeadLockExample {
	public static void main(String[] args) {
		Thread T1 = new Thread(()->{
			synchronized (Resources.lock1) {
				System.out.println("Thread 1 clocked Lock1");
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("Thread 1 waiting to lock lock2");
				synchronized (Resources.lock2) {
					System.out.println("Thread 1 locked resource 2");
				}
			}
		});
		
		Thread T2 = new Thread(()->{
			synchronized (Resources.lock1) {
				System.out.println("Thread 1 clocked Lock1");
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("Thread 1 waiting to lock lock2");
				synchronized (Resources.lock2) {
					System.out.println("Thread 1 locked resource 2");
				}
			}
		});
		
		T1.start();
		T2.start();
	}

}

class Resources{
	static final Object lock1 = new Object();
	static final Object lock2 = new Object();
}
