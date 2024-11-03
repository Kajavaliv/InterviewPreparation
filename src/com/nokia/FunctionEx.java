package com.nokia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

interface Intf
{
	public int m1(int n);
}
public class FunctionEx {
	public static void main(String[] args) {
		Intf i = (n)->{return n*n;};
		int x = i.m1(25);
		System.out.println(x);
		
		Runnable r = ()->{
			for(int j=0;j<10;j++) {
				System.out.println("Chaild");
			}
		};
		
		Thread T = new Thread(r);
		//T.start();
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(10);
		list.add(1);
		list.add(1000);
		list.add(9);
		list.add(100);
		
		Comparator<Integer> C = (a,b)->(a<b)?-1:(a>b)?1:0;
		Collections.sort(list,C);
		list.stream().forEach(System.out::println);
		//System.out.println(list);
		List<Integer> l = list.stream().filter(K->K%2==0).collect(Collectors.toList());
		System.out.println(l);
		
	}
	
	
}
