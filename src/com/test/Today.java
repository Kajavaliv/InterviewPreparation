package com.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Today {
	public static void main(String[] args) {
		int[] A = {1,3,6,7,8};
		int[] B = {5,8,9,2,10};
		int[] C = IntStream.concat(Arrays.stream(A), Arrays.stream(B)).toArray();
		for(int i=0;i<C.length;i++) {
			//System.out.print(C[i]+" ");
		}
		 C = IntStream.concat(Arrays.stream(A), Arrays.stream(B)).sorted().distinct().toArray();
		 for(int i=0;i<C.length;i++) {
				//System.out.print(C[i]+" ");
		}
		 
		int[] D = IntStream.rangeClosed(1, A.length).map(i -> A[A.length-i]).toArray();
		for(int i=0;i<D.length;i++) {
			//System.out.print(D[i]+" ");
		}
		
		String S = "lkhkjgwyflajkgh";
		//System.out.println(S.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(7);
		list.add(2);
		list.add(8);
		list.add(9);
		list.add(9);
		
		//System.out.println(list.stream().collect(Collectors.partitioningBy(i -> i%2==0)));
		//System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		
		//list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		//list.stream().filter(i -> i%2==0).forEach(System.out::println);
		
		//System.out.println(list.stream().max(Comparator.naturalOrder()).get());
		//System.out.println(list.stream().min(Comparator.naturalOrder()).get());
		
		String S1 = "MAMDM";
		String S3 = "DAMMM";
		
		S1 = Stream.of(S1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
		S3 = Stream.of(S3.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
		if(S1.equals(S3))
			System.out.println("Yes");
		
		list.stream().sorted().limit(3).forEach(System.out::println);
		list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		
		List<String> list1 = new ArrayList<>();
		list1.add("kjd");
		list1.add("jjj");
		list1.add("mnxbv");
		list1.add("uey");
		list1.add("jhsdfui");
		list1.add("ywrt");
		
		list1.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		
		String K = "kjf jkdhy ahjgdty yeyb";
		System.out.println(Arrays.stream(K.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" ")));
		
		System.out.println(IntStream.range(1, 10).sum());
		System.out.println(IntStream.range(1, 10).average().getAsDouble());
		IntStream.range(1, 10).forEach(System.out::println);
		
		Set<Integer> set = new HashSet<>();
				 list.stream().filter(i -> set.add(i)).collect(Collectors.toSet());
				 System.out.println(set);
				 
	    System.out.println(list1.stream().skip(list1.size()-1).findFirst().get());
		
	}

}
