package com.nokia;

public class OddEvenThreads {
	private static final int MAXNUM = 10;
	private static final Object lock = new Object();
	
	private static boolean isOddOn = true;
	public static void main(String[] args) {
		Thread T1 = new Thread(new Oddprint(), "Odd-Thread");
		Thread T2 = new Thread(new evenprint(),"Even-Thread");
		
		T1.start();
		T2.start();
	}
	
	
	static class Oddprint implements Runnable{
		public void run() {
			for(int i=1;i<=MAXNUM;i+=2) {
				synchronized(lock){
					while(!isOddOn) {
						try{
							lock.wait();
						}catch (InterruptedException e) {
							Thread.currentThread().interrupt();
						}
					}
					System.out.println(Thread.currentThread().getName()+":"+i);
					isOddOn = false;
					lock.notifyAll();
				}				
			}
		}
		
	}
	
	static class evenprint implements Runnable{
		public void run() {
			for(int i=2;i<=MAXNUM;i+=2) {
				synchronized (lock) {
					while(isOddOn) {
						try {
							lock.wait();
						}catch (InterruptedException e) {
							Thread.currentThread().interrupt();
						}
					}
					System.out.println(Thread.currentThread().getName()+":"+i);
					isOddOn = true;
					lock.notifyAll();
				}
			}
		}
	}

}
