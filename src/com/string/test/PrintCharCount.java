package com.string.test;

public class PrintCharCount {
	private static String str = "1A2B3C4D";
	private static int index = 0;
	private static final Object lock = new Object();
	private static int count = 0;
	
	public static void main(String[] args) {
		Thread T1 = new Thread(new numberPrint());
		Thread T2 = new Thread(new letterPring());
		
		T1.start();
		T2.start();
	}
	
	public static class numberPrint implements Runnable{
		public void run() {
			synchronized (lock) {
				while(true) {
					try {
						if(index>=str.length())
							break;
						char c = str.charAt(index);
						if(Character.isDigit(c)) {
							count = Character.getNumericValue(c);
							System.out.print(c+" ");
							lock.notifyAll();
							index++;
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
	
	public static class letterPring implements Runnable{
		public void run() {
			synchronized (lock) {
				while(true) {
					try {
						if(index>=str.length())
							break;
						char c = str.charAt(index);
						if(Character.isLetter(c)) {
							while(count!=0) {
								System.out.print(c+" ");
								count--;
							}
							index++;
							System.out.println();
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
