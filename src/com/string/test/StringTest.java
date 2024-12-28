package com.string.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StringTest {
	public static void main(String[] args) {
		String S = "jdjgiyeusatmxzjf";
		System.out.println(S.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		
		System.out.println(IntStream.range(0, S.length()).mapToObj(i ->S.charAt(S.length()-1-i)).map(String::valueOf).collect(Collectors.joining()));
		int[] A = {3,4,5,2,7,8};
		int[] B = IntStream.rangeClosed(1, A.length).map(i -> A[A.length-i]).toArray();
		
		String K = "KAJAVALI";
		char[] c = K.toCharArray();
		int left = 0;
		int right = c.length-1;
		while(left<right) {
			char tmp = c[left];
			c[left++] = c[right];
			c[right--]= tmp;
		}
		
		System.out.println(new String(c));
		
		System.out.println(isPalindrome("MADAMK"));
		System.out.println(firstNonRepeatingChar(K));
		
		final String A1 = "MADAM";
		String A2 = "ADMAMK";
		
		//A1 = Stream.of(A1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		A2 = Stream.of(A2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		if(A1.equals(A2)) {
			System.out.println("ANAGRAM");
		}else {
			System.out.println("NOT ANAGRAM");
		}
		
		System.out.println(substrings(K));
		
		String L = "234578K";
		System.out.println(L.matches("\\d+"));
		
		String M = "abc dcef kljkh lkhgsf";
		System.out.println(Stream.of(M.split(" ")).map(word-> new StringBuffer(word).reverse()).collect(Collectors.joining(" ")));
		Stream.of(M.split(" ")).map(word-> new StringBuffer(word)).sorted().filter(w->w.length()%2==0).forEach(System.out::println);
		
		System.out.println(IntStream.range(0, A1.length())
				.mapToObj(i->A1.charAt(A1.length()-1-i))
				.map(String::valueOf)
				.collect(Collectors.joining()).equals(A1));
		
		System.out.println(Fruite.Apple.name());
		System.out.println(Fruite.Banana.name());
		System.out.println(Fruite.Grape.name());
		
		
		
		
	}
	
	enum Fruite{
		Apple,
		Banana,
		Grape
	}
		
	public static boolean isPalindrome(String s) {
	    int left = 0, right = s.length() - 1;
	    while (left < right) {
	        if (s.charAt(left++) != s.charAt(right--)) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static char firstNonRepeatingChar(String s) {
	    Map<Character, Integer> freqMap = new HashMap<>();
	    for (char c : s.toCharArray()) {
	        freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
	    }
	    for (char c : s.toCharArray()) {
	        if (freqMap.get(c) == 1) {
	            return c;
	        }
	    }
	    return '\0'; // Return null character if no unique character
	}
	
	public static List<String> substrings(String s){
		List<String> subs = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				subs.add(s.substring(i,j));
			}
		}
		System.out.println(subs.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		return subs;
	}

}
