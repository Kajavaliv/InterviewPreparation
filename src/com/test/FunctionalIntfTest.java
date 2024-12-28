package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionalIntfTest{
	
	
	public static void main(String[] args) {
		Thread T1 = new Thread(()->{
			System.out.println("Functional Test");
		});
		
		T1.start();
		
		int[] A = {1,5,8,2,10};
		int[] B = {3,7,6,11,9,8,10};
		int[] C = IntStream.concat(Arrays.stream(A), Arrays.stream(B)).sorted().distinct().toArray();
		
		
		
		functional F1 = (name)->System.out.println("Hello "+name);
		
		F1.displayMsg("KAJA");
		List<Integer> list  = new ArrayList<>();
		list.add(3);
		list.add(33);
		list.add(34);
		list.add(58);
		list.add(17);
		list.add(2);
		list.add(9);
		list.add(17);
		
		List<Integer> list3  = new ArrayList<>();
		list.add(3);
		list.add(36);
		list.add(34);
		list.add(58);
		
		list.stream().filter(i -> i % 5 == 0).forEach(System.out::println);
		
		List<String> list1  = new ArrayList<>();
		list1.add("A");
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("B");
		
		System.out.println(list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		
		System.out.println(list.stream().collect(Collectors.partitioningBy(i -> i%2==0)));
		System.out.println(list.stream().distinct().collect(Collectors.toList()));
		
		String S = "kjhdgkj skfhkdsgj ljsfikljlk khfkshg";
		System.out.println(S.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		
		System.out.println(list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		System.out.println(list.stream().max(Comparator.naturalOrder()).get());
		System.out.println(list.stream().min(Comparator.naturalOrder()).get());
		
		String S1 = "MADAM";
		String S2 = "DAMAM";
		
		S1 = Stream.of(S1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		S2 = Stream.of(S2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
		if(S1.equals(S2)){
			System.out.println("ANAGRAM");
		}else {
			System.out.println("NOT");
		}
		
		list.stream().sorted().limit(3).forEach(System.out::println);
		list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		
		list.stream().filter(list3::contains).forEach(System.out::println);
		
		System.out.println(Arrays.stream(A).sum());
		System.out.println(Arrays.stream(A).average().getAsDouble());
		
		System.out.println(Arrays.stream(S.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" ")));
		
		int[] D = IntStream.rangeClosed(1, A.length).map(i ->A[A.length-i]).toArray();
		System.out.println(IntStream.range(1, 10).sum());
		
	}
	
	

	
}

interface functional{
	public void displayMsg(String msg);
}
