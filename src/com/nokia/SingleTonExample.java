package com.nokia;



public class SingleTonExample {
	
	private SingleTonExample() {
		if(SingleTonHelper.INSTANCE != null) {
			System.out.println("KAJA");
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
		try {
			SingleTonExample Test = SingleTonExample.getInstance();
			SingleTonExample Test1 = SingleTonExample.getInstance();
			
			System.out.println(Test.hashCode());
			System.out.println(Test1.hashCode());
			
			
		}catch (IllegalStateException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
