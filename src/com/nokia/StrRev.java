package com.nokia;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StrRev {
	private static int MAX = 20;
	private static Object lock = new Object();
	private static boolean isOddOn = true;
	private static int index = 0;
	
	
	public static void main(String[] args) {
		Thread T1 = new Thread(new ODD(),"ODD");
		Thread T2 = new Thread(new EVEN(),"EVEN");
		T1.start();
		T2.start();
		
	} 
	
	static class ODD implements Runnable{
		public void run() {
			
				for(int i=1;i<=MAX;i+=2) {
					synchronized (lock) {
						while(!isOddOn) {
							try {
								lock.wait();
							}catch (Exception e) {
								// TODO: handle exception
							}
						}
						System.out.println(Thread.currentThread().getName()+"->"+i);
						isOddOn = false;
						lock.notifyAll();
					}
				}
			
		}
	}
	
	static class EVEN implements Runnable{
		public void run() {
			for(int i=2;i<=MAX;i+=2) {
				synchronized (lock) {
					while(isOddOn) {
						try {
							lock.wait();
						}catch (Exception e) {
							// TODO: handle exception
						}
					}
					System.out.println(Thread.currentThread().getName()+"->"+i);
					isOddOn = true;
					lock.notifyAll();
				}
			}
		}
	}

}
