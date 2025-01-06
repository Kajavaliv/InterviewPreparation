package com.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.*;

public class Demo {
	public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 1, 3, 7, 5, 1, 3, 6};
        int[] result = groupDuplicates(inputArray);

        // Print the output array
        System.out.println(Arrays.toString(result));
    }

    public static int[] groupDuplicates(int[] array) {
        // Use a LinkedHashMap to maintain the order and count frequencies
        Map<Integer, List<Integer>> frequencyMap = new LinkedHashMap<>();

        // Populate the map with elements and their occurrences
        for (int num : array) {
            frequencyMap.putIfAbsent(num, new ArrayList<>());
            frequencyMap.get(num).add(num);
        }

        // Flatten the map into a single list
        List<Integer> groupedList = new ArrayList<>();
        for (List<Integer> group : frequencyMap.values()) {
            groupedList.addAll(group);
        }

        // Convert the list back to an array
        int[] result = new int[groupedList.size()];
        for (int i = 0; i < groupedList.size(); i++) {
            result[i] = groupedList.get(i);
        }

        return result;
    }

}
