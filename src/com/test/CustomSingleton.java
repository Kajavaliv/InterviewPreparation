package com.test;

import java.util.*;
public class CustomSingleton {
	private static final int MAXINSTANCES = 5;
	private static int instanceCount = 0;
	private static final List<CustomSingleton> instances = new ArrayList<>();
	
	private CustomSingleton() {
		System.out.println("Instance created");
	}
	
	public static synchronized CustomSingleton getInstance(){
		if(instanceCount<MAXINSTANCES) {
			CustomSingleton instance = new CustomSingleton();
			instances.add(instance);
			instanceCount++;
		}
		return instances.get((instanceCount-1)%MAXINSTANCES);
	}
	
	public static synchronized List<CustomSingleton> getAllInstance(){
		return new ArrayList<>(instances);
	}
	
	public static void main(String[] args) {
		CustomSingleton C1 = getInstance();
		CustomSingleton C2 = getInstance();
		CustomSingleton C3 = getInstance();
		CustomSingleton C4 = getInstance();
		CustomSingleton C5 = getInstance();
		CustomSingleton C6 = getInstance();
		System.out.println(C5.hashCode());
		System.out.println(C4.hashCode());
		
		System.out.println("Total:"+getAllInstance().size());
	}

}
