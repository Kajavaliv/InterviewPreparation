package com.string.test;

import java.io.IOError;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.File;
import java.io.FileReader;

public class StringPractice {
	public static void main(String[] args) { 	
	
		try {
			int result = 10/0;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("Error: Cannot devided by zero");
		}finally {
			System.out.println("Execution done");
		}
		
		try {
			checkAge(15);
		}catch(IllegalArgumentException e) {
			System.out.println("error:"+e.getMessage());
		}
		
		try {
			readFile("Hello.txt");
		}catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}

	private static void readFile(String string) throws IOException {
		File file = new File(string);
		FileReader F = new FileReader(file);
		System.out.println("File opened ......");
		
	}

	private static void checkAge(int i) {
		if(i<18) {
			throw new IllegalArgumentException("Age must be 18 or more");
		}
		System.out.println("Age is valid");
	}

}
