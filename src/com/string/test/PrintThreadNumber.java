package com.string.test;

import java.util.Arrays;

public class PrintThreadNumber {
	public static void main(String[] args) {
		String S = "146283";
		for(Character c : S.toCharArray()) {
			//System.out.println("Thread-"+c+" :"+c);
		}
		
		String S1 = "1,4,6,2,8,3";

        // Split the string into individual elements
        String[] numbers = S1.split(",");

        // Process each number in a separate thread
        Arrays.stream(numbers).forEach(number -> {
            // Create a new thread for each number
            Thread thread = new Thread(() -> {
                // Print thread name and the number
                
                try {
                	System.out.println(Thread.currentThread().getName() + " processed number: " + number);
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            });

            // Name the thread dynamically
            thread.setName("Thread-" + number);

            // Start the thread
            thread.start();
        });
		
		
	}

}
