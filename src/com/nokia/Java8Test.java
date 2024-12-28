package com.nokia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Test {
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
		
		
		Map<Boolean,List<Integer>> map = list.stream().collect(Collectors.partitioningBy(i -> (i%2==0)));
		System.out.println("Odd:"+map.get(false));
		System.out.println("Even:"+map.get(true));
		
		List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctList);
		
		String S= "Hello world";
		Map<Character,Long> charM = S.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(charM);
		
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
		System.out.println(stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println(stationeryList.stream().collect(Collectors.joining(",","[","]")));
		
		System.out.println(Arrays.stream(S.split("")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining("")));
		IntStream.rangeClosed(1, 10).map(i->i*2).forEach(System.out::println);
		
		Map<String,Long> X = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Entry<String,Long> Y = X.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println(Y.getKey());
		System.out.println(Y.getValue());
	}

}
