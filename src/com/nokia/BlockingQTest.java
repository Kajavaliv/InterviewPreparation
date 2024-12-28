package com.nokia;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQTest {
	public static void main(String[] args) {
		BlockingQueue<Integer> Q = new ArrayBlockingQueue<>(10);
		
		Thread producer = new Thread(()->{
			try {
				for(int i=0;i<10;i++) {
					System.out.println("Producing:"+i);
					Q.put(i);
					Thread.sleep(500);
				}
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			
		});
		
		Thread consumer = new Thread(()->{
			try {
				while(true) {
					System.out.println("consuming:"+Q.take());					
					Thread.sleep(500);
				}
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			
		});
		
		producer.start();
		consumer.start();
	}

}
