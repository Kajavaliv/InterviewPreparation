package com.nokia;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test11 {

	public static void main(String[] args) {
		String S= "14783956";
		ExecutorService executer = Executors.newSingleThreadExecutor();
		for(char c:S.toCharArray()) {
			executer.submit(()->System.out.println("Thread-"+c+":"+c));
		}
		executer.shutdown();
	}
}

