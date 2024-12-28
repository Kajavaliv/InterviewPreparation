package com.nokia;

public class SingleTonTest {
	
	private SingleTonTest()
	{
		if(SingleTonHelper.INSTANCE != null) {
			throw new IllegalStateException("Instance already created");
		}
	}
	
	private static class SingleTonHelper{
		private static final SingleTonTest INSTANCE = new SingleTonTest();
	}
	
	public static SingleTonTest getInstance()
	{
		return SingleTonHelper.INSTANCE;
	}
	
	public static void main(String[] args) {
		SingleTonTest Test1 = getInstance();
		SingleTonTest Test2 = getInstance();
		
		System.out.println(Test1.hashCode());
		System.out.println(Test2.hashCode());
	}

}
