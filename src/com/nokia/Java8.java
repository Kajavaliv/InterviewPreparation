package com.nokia;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8 {
	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<>();
		list.add(3);
		list.add(33);
		list.add(34);
		list.add(58);
		list.add(17);
		list.add(2);
		list.add(9);
		list.add(17);
		
		
		System.out.println(list.stream().collect(Collectors.partitioningBy(i ->
		 (i%2==0))));
		System.out.println(list.stream().distinct().collect(Collectors.toList()));
		/* 
		 * String S = "kajavali vadapalli";
		 * System.out.println(S.chars().mapToObj(c->(char)c).collect(Collectors.
		 * groupingBy(Function.identity(),Collectors.counting())));
		 * System.out.println(list.stream().collect(Collectors.groupingBy(Function.
		 * identity(),Collectors.counting())));
		 * list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		 * System.out.println(list.stream().max(Comparator.naturalOrder()).get());
		 * System.out.println(list.stream().min(Comparator.naturalOrder()).get());
		 */
		
		int[] A = {1,5,8,2,10};
		int[] B = {3,7,6,11,9,8,10};
		int[] C = IntStream.concat(Arrays.stream(A), Arrays.stream(B)).sorted().distinct().toArray();
		for(int i: C) {
			System.out.print(i+" ");
		}
		
		String s1 = "MADAM";
		String s2 = "DAMMA";
		
		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
		if(s1.equals(s2))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		list.stream().sorted().limit(3).forEach(System.out::println);
		list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		
		System.out.println(Stream.of(String.valueOf(12345).split("")).collect(Collectors.summingInt(Integer::parseInt)));
		
		System.out.println(list.stream().sorted().skip(3).findFirst().get());
		
		System.out.println(Arrays.stream(A).sum());
		System.out.println(Arrays.stream(A).average());
		System.out.println(IntStream.range(1, 10).sum());
		
		int[] D = IntStream.rangeClosed(1, A.length).map(i->A[A.length-i]).toArray();
		for(int k:D) {
			System.out.print(k+" ");
		
		}
		
	}

}
