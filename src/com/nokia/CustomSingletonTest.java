package com.nokia;
import java.util.*;

public class CustomSingletonTest {
	
	private static final int MAXINSTANCES = 5;
	private static int instanceCount = 0;
	
	private static final List<CustomSingletonTest> intcnaces = new ArrayList<>();
	
	private CustomSingletonTest() {
		System.out.println("Instance created");
	}
	
	public static synchronized CustomSingletonTest getInstance() {
		if(instanceCount<MAXINSTANCES) {
			CustomSingletonTest newInstance = new CustomSingletonTest();
			intcnaces.add(newInstance);
			instanceCount++;
		}
		return intcnaces.get((instanceCount-1)%MAXINSTANCES);
	}
	
	public static synchronized List<CustomSingletonTest> getallInstances(){
		return new ArrayList<>(intcnaces);
	}
	
	public static void main(String[] args) {
		CustomSingletonTest T1 = getInstance();
		CustomSingletonTest T2 = getInstance();
		CustomSingletonTest T3 = getInstance();
		CustomSingletonTest T4 = getInstance();
		CustomSingletonTest T5 = getInstance();
		CustomSingletonTest T6 = getInstance();
		
		System.out.println("Total Instances:"+CustomSingletonTest.getallInstances().size());
		System.out.println(T4.hashCode());
		System.out.println(T6.hashCode());
	}

}
