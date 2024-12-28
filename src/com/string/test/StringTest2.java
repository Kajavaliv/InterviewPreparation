package com.string.test;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringTest2 {
	public static void main(String[] args) {
		String S = "KAJAVALI";
		System.out.println(getPairSwap(S));
		
		for(int i=0;i<S.length();i++) {
			for(int j=i+1;j<=S.length();j++) {
				System.out.println(S.substring(i,j));
			}
		}
		
		System.out.println(S.substring(0,3)+'B'+S.substring(4));
		String B = "0000073666665";
		
		System.out.println(removeLeadzeero(B));
		
		System.err.println(Stream.of(S.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining()));
		
	}
	
	static String removeLeadzeero(String B) {
		int i=0;
		while(i<B.length()&&B.charAt(i)=='0') {
			i++;
		}
			StringBuffer SB= new StringBuffer(B);
			SB.replace(0, i, "");
		
		return SB.toString();
	}
	
	public static String getPairSwap(String s) {
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i+=2) {
			char tmp = ch[i];
			ch[i]=ch[i+1];
			ch[i+1]= tmp;
		}
		return new String(ch);
	}

}
