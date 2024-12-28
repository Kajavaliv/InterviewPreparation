package com.nokia;

public class ThreadTest {
	
	private static final int MAXTRIES = 10;
	private static Object lock = new Object();
	private static boolean isNumberOn = true;
	
	public static void main(String[] args) {
		Thread T1 = new Thread(new numberPrint());
		Thread T2 = new Thread(new charPrint());
		
		T1.start();
		T2.start();
	}
	
	
	static class numberPrint implements Runnable{
		public void run() {
			for(int i=1;i<=MAXTRIES;i++) {
				synchronized (lock) {
					while(!isNumberOn) {
						try {
							lock.wait();
						}catch(InterruptedException e){
							Thread.currentThread().interrupt();
						}						
					}
					System.out.print(i);
					isNumberOn = false;
					lock.notifyAll();
				}
			}
		}
	}
	
	static class charPrint implements Runnable{
		public void run() {
			for(char c='A';c<='A'+MAXTRIES;c++) {
				synchronized (lock) {
					while(isNumberOn) {
						try {
							lock.wait();
						}catch(InterruptedException e) {
							Thread.currentThread().interrupt();
						}
					}
					System.out.print(c);
					isNumberOn = true;
					lock.notifyAll();
				}
			}
		}
	}

}
