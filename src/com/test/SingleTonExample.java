package com.test;


public class SingleTonExample {
	
	private SingleTonExample() {
		if(SingleTonHelper.INSTANCE != null) {
			throw new IllegalStateException("Instance already created");
		}
	}
	
	private static class SingleTonHelper{
		private static final SingleTonExample INSTANCE = new SingleTonExample();
	}
	
	public static SingleTonExample getInstance() {
		return SingleTonHelper.INSTANCE;
	}
	
	public static void main(String[] args) {
		SingleTonExample S1 = SingleTonExample.getInstance();
		SingleTonExample S2 = SingleTonExample.getInstance();
		System.out.println(S1.hashCode()==S2.hashCode());
	}

}
