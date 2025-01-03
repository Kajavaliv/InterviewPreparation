package com.dsa;

import java.util.function.Function;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Today {
	public static void main(String[] args) {
		String S = "KAJAVALI";
		//System.out.println(IntStream.range(0, S.length()).mapToObj(i->S.charAt(S.length()-i-1)).map(String::valueOf).collect(Collectors.joining()));
		int[] A = {1,4,1,2,3,7,2,5,3,6};
		//Arrays.stream(IntStream.rangeClosed(1, A.length).map(i->A[A.length-i]).toArray()).forEach(System.out::println);
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,1,2,3,4,5,6,7,8));
		//System.out.println(list.stream().collect(Collectors.partitioningBy(i->i%2==0)));
		
		//list.stream().distinct().forEach(System.out::println);
		
		//System.out.println(S.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		
		//list.stream().sorted().forEach(System.out::println);
		
		int left=0,right=A.length-1;
		while(left<right) {
			int tmp = A[left];
			A[left++] = A[right];
			A[right--] = tmp;
		}
		
		for(int n:A) {
			//System.out.print(n+" ");
		}
		
		String K = "MADAM";
		char[] ch = K.toCharArray();
		int L=0,R=ch.length-1;
		while(L<R) {
			if(ch[L++]!=ch[R--])
				System.out.println("FALSE");
		}
		
		List<String> list1 = new ArrayList<>(Arrays.asList("Akhj","Bhjhu","Ckjl","Akljdlj"));
		//System.out.println(list1.stream().collect(Collectors.joining(",", "A", "j")));
		//list.stream().filter(i->i%5==0).forEach(System.out::println);
		//System.out.println(list.stream().max(Comparator.naturalOrder()).get());
		//System.out.println(list.stream().min(Comparator.naturalOrder()).get());
		
		String M = "DAMAM";
		K = Stream.of(K.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		M = Stream.of(M.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		//if(K.equals(M))
			//System.out.println("YES");
		
		int x = 12345;
		//System.out.println(Stream.of(String.valueOf(x).split("")).collect(Collectors.summingInt(Integer::parseInt)));
		
		//list.stream().sorted().limit(3).forEach(System.out::println);
		//list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		//System.out.println(Arrays.stream(A).sum());
		//System.out.println(Arrays.stream(A).average().getAsDouble());
		//System.out.println(IntStream.range(1, 10).sum());
		//list.stream().collect(Collectors.toSet()).forEach(");
		
		int a=0,b=1;
		for(int i=0;i<20;i++) {
			//System.out.println(a);
			int next = a+b;
			a = b;
			b = next;
		}
		
		Map<Integer, Long> map = Arrays.stream(A).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		List<Integer> repeated = new ArrayList<>();
		List<Integer> nonrepeat = new ArrayList<>();
		System.out.println(map.toString());
		
		for(Map.Entry<Integer, Long> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				for(int i=0;i<entry.getValue();i++) {
					repeated.add(entry.getKey().intValue());
				}
			}else {
				nonrepeat.add(entry.getKey().intValue());
			}
		}
		
		repeated.addAll(nonrepeat);
		int[] B = new int[repeated.size()];
		for(int i=0;i<repeated.size();i++)
			B[i]=repeated.get(i);
		
		for(int i:B) {
			System.out.print(i+" ");
		}
		
		
	}
}
