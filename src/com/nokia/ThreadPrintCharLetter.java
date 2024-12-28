package com.nokia;

public class ThreadPrintCharLetter {
	
	private static final String S = "1A2B3C";
	private static Object lock = new Object();
	private static int index = 0;
	
	public static void main(String[] args) {
		Thread T1 = new Thread(new numbersPrint(),"Number-thread");
		Thread T2 = new Thread(new letterPrint(), "Letter-thread");
		
		T1.start();
		T2.start();
	}
	
	
	static class numbersPrint implements Runnable{
		public void run() {
			while(true) {
				synchronized (lock) {
					if(index>=S.length()) {
						break;
					}
					char c = S.charAt(index);
					if(Character.isDigit(c)) {
						System.out.println(Thread.currentThread().getName()+":"+c);
						index++;
						lock.notifyAll();
					}else {
						try {
							lock.wait();
						}catch(InterruptedException e) {
							Thread.currentThread().interrupt();
						}
					}
				}
			}
		}
	}
	
	static class letterPrint implements Runnable{
		public void run() {
			while(true) {
				synchronized (lock) {
					if(index>=S.length()) {
						break;
					}
					char c = S.charAt(index);
					if(Character.isLetter(c)) {
						System.out.println(Thread.currentThread().getName()+":"+c);
						index++;
						lock.notifyAll();
					}else {
						try {
							lock.wait();
						}catch(InterruptedException e) {
							Thread.currentThread().interrupt();
						}
					}
				}
			}
		}
	}

}
