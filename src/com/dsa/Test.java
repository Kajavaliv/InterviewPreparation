package com.dsa;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		int[] A = {1,2,1,2,3,1,2,3,3,4,6};
		
		Map<Integer,Integer> map = IntStream.range(0, A.length)
				.boxed()
				.collect(Collectors.toMap(i->i, i->A[i]));
		System.out.println(map);
		
		
		
	}

}
