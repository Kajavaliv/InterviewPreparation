package com.linkedlist;
import java.lang.System.LoggerFinder;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
 

public class Example {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("Y")) {
            	list.remove(item); // Direct modification
            }
        }
        
        System.out.println(list);
        
        int[] num = new int[]{4, 2, 3, 6, 7, 9, 2, 4};
        Set<Integer> set = new HashSet<>();
        Set<Integer> dup = Arrays.stream(num).boxed().collect(Collectors.toList()).stream().filter(e->!set.add(e)).collect(Collectors.toSet());
        System.out.println(dup);
        
        String S = "swiss";
        Map<Character,Long> map = S.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Character ch = map.entrySet().stream().filter(e->e.getValue()==1).findFirst().get().getKey();
        System.out.println(ch);
        
        
        
        
String input = "ABBBCDDEFEFGGH";
        
        // Find characters that occur more than once
        List<Character> result = input.chars() // Convert the string to an IntStream
            .mapToObj(c -> (char) c) // Convert int to Character
            .collect(Collectors.groupingBy(c -> c, Collectors.counting())) // Group by character and count
            .entrySet().stream() // Create a stream of the entry set
            .filter(entry -> entry.getValue() > 1) // Filter entries with count > 1
            .map(Map.Entry::getKey) // Get the character
            .collect(Collectors.toList()); // Collect results to a List

        // Print the result
        System.out.println(result); // Output: [B, D, G]\
    }
	

}
