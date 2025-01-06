package com.linkedlist;



public class NumLet {
	private static int MAX=10;
	private static Object lock = new Object();
	private static Boolean isNum=true;
	static int count=0;
	public static void main(String[] args) {
		
		Thread T1 = new Thread(()->{
			for(int i=1;i<=MAX;i++) {
				synchronized (lock) {
					while(!isNum) {
						try {
							lock.wait();
						}catch(InterruptedException e) {
							Thread.interrupted();
						}
					}
					System.out.print(i+" ");
					count=i;
					isNum=false;
					lock.notifyAll();
				}
			}
		});
		
		Thread T2 = new Thread(()->{
			for(char c='A';c<='A'+MAX;c++) {
				synchronized (lock) {
					while(isNum) {
						try {
							lock.wait();
						}catch(InterruptedException e) {
							Thread.interrupted();
						}
					}
					while(count>0) {
						System.out.print(c+" ");
						count--;
					}
					
					isNum=true;
					lock.notifyAll();
					System.out.println();
				}
			}
		});
		
		T1.start();
		T2.start();
	}

}
