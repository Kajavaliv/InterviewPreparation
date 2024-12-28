package com.nokia;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableEcample {
	public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<String> task = new MyCallable();
        Future<String> result = executor.submit(task);

        // Fetch the result of the callable
        System.out.println(result.get());
        executor.shutdown();
    }

}
class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Callable task completed.";
    }
}
