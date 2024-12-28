package com.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Integer> C = new Callable<Integer>() {
			public Integer call() throws InterruptedException {
				System.out.println("Task is executed by "+Thread.currentThread().getName());
				Thread.sleep(500);
				return 42;
			}
		};
		ExecutorService ES = Executors.newSingleThreadExecutor();
		Future<Integer> F = ES.submit(C);
		System.out.println(F.get());
		ES.shutdown();
	}

}
