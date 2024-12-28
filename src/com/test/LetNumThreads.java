package com.test;

public class LetNumThreads {
	
	private static Object lock = new Object();
	private static int index = 0;
	private static String S = "1A2B3C4D";
	
	public static void main(String[] args) {
		Thread Num = new Thread(new NumPrint(),"Num");
		Thread Let = new Thread(new LetPrint(),"Let");
		
		Num.start();
		Let.start();
	}
	
	static class NumPrint implements Runnable{
		public void run() {
			
			while(true) {
				
				synchronized (lock) {
					if(index>=S.length()) {
						break;
					}
					char c = S.charAt(index);
					try {
						if(Character.isDigit(c)) {
							System.out.println(Thread.currentThread().getName()+":"+c);
							index++;
							lock.notifyAll();
						}else {
							lock.wait();
						}
					}catch(InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
			}
		}
	}
	
	static class LetPrint implements Runnable{
		public void run() {
			
			while(true) {
				
				synchronized (lock) {
					if(index>=S.length()) {
						break;
					}
					char c = S.charAt(index);
					try {
						if(Character.isLetter(c)) {
							System.out.println(Thread.currentThread().getName()+":"+c);
							index++;
							lock.notifyAll();
						}else {
							lock.wait();
						}
					}catch(InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
			}
		}
	}

}
