package com.nokia;
import java.util.*;
import java.util.function.Predicate;

public class PredicateTest {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		Predicate<Integer> Odd = n ->n%2!=0;
		Predicate<Integer> even = n ->n%2==0;
		Predicate<Integer> greater7 = n ->n>7;
		
		Predicate<Integer> andcheck = even.and(greater7);
		Predicate<Integer> notcheck = even.or(greater7);
		
		//System.out.println(notcheck.test(8));
		
		list.stream().filter(Odd.negate()).forEach(System.out::println);
		//list.stream().filter(even).forEach(System.out::println);
		
		Predicate<String> equal = s->s.equals("Hello");
		System.out.println(equal.test("Hello"));
		System.out.println(equal.test("test"));
	}

}
