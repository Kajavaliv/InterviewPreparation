package com.test;

public class Syncro {
	public static void main(String[] args) {
		Source S = new Source();
		Thread T1 = new Thread(()-> S.getSource(2));
		Thread T2 = new Thread(()-> S.getSource(5));
		
		T1.start();
		T2.start();
	}

}

class Source {
	public synchronized void getSource(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
