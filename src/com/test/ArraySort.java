package com.test;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraySort {
	public static void main(String[] args) {
		
		
		
		int[] input = {1, 4, 5, 1, 3, 2, 7, 1, 3};
		
		Map<Integer,Long> maps = Arrays.stream(input).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		List<Integer> repeated = new ArrayList<>();
		List<Integer> notrepeat = new ArrayList<>();
		
		for(Map.Entry<Integer, Long> entry:maps.entrySet()) {
			if(entry.getValue()>1) {
				for(int i=0;i<entry.getValue();i++)
					repeated.add(entry.getKey().intValue());
			}else {
				notrepeat.add(entry.getKey().intValue());
			}
		}
		System.out.println("Repeat:"+repeated);
		System.out.println("notRepeat:"+notrepeat);
		repeated.addAll(notrepeat);
		int[] sorted = new int[input.length];
		for(int i=0;i<input.length;i++) {
			sorted[i] = repeated.get(i);
		}
		System.out.println(Arrays.toString(sorted));
		
	}

	private static boolean isPoly(String p) {
		char[] ch = p.toCharArray();
		int left=0,right=ch.length-1;
		while(ch[left++] != ch[right--]) {
			return false;
		}
		return true;
	}

}
