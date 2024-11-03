package com.nokia;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Annonimas {
	
	public static void main(String[] args) {
		Runnable R = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("KAJAVALI VADAPALLI");				
			}
		};
		
		Thread T = new Thread(R);
		T.start();
		
		BiPredicate<Integer,Integer> P = (x,y)->x*y>100;
		System.out.println(P.test(7,90));
	}

}
