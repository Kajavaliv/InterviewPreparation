package com.linkedlist;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class Str {
	public static void main(String[] args) {
		String S = "aaabbcaadddeeeef";
		StringBuffer SB = new StringBuffer();
		
		int count = 1;
		for(int i=1;i<S.length();i++) {
			if(S.charAt(i)==S.charAt(i-1))
				count++;
			else {
				SB.append(S.charAt(i-1)).append(count);
				count = 1;
			}
		}
		SB.append(S.charAt(S.length()-1)).append(count);
		System.out.println(SB.toString());
		
		
		//////////////////////
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,2,3,3,5,5,5,5));
		Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		List<Long> values = new ArrayList<>(map.values());
		Collections.sort(values,Collections.reverseOrder());
		System.out.println(values);
		int result = -1;
		for(Map.Entry<Integer, Long> entry:map.entrySet()) {
			if(entry.getValue()==values.get(1)) {
				result = entry.getKey();
			}
		}
		System.out.println("result:"+result);
		
		List<String> names = Arrays.asList("prasad", "kumar");
		Map<String,String> maps = names.stream().collect(Collectors.toMap(name->String.valueOf(name.charAt(0)).toUpperCase(),
				name->name.substring(0, 1).toUpperCase()+name.substring(1)));
		System.out.println(maps);
		
		String K = "ABBBCDDEFEFGGH";
		List<Character> list1 = new ArrayList<>();
		for(char c:K.toCharArray()) {
			list1.add(c);
		}
		
		Map<Character, Integer> charCount = new LinkedHashMap<>();
        
        // Count each character's occurrence
        for (char c : K.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Identify characters that appear more than once
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        
        String L = "swiss";
        for(char c: L.toCharArray()) {
        	if(L.indexOf(c)==L.lastIndexOf(c)) {
        		System.out.println("Letter:"+c);
        		break;
        	}
        }
	}

}
