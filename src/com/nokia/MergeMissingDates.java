package com.nokia;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class MergeMissingDates {
    public static void main(String[] args) {
        String file1Path = "C:\\Projects\\LLDP\\shared-yang-model-sros\\unittest\\set1\\telemetry\\tableNameMap.json";
        String file2Path = "C:\\Projects\\LLDP\\shared-yang-model-sros\\build\\telemetry\\tableNameMap.json";

        try {
            // Read lines from both files
            Set<String> linesInFile1 = readLinesFromFile(file1Path);
            Set<String> linesInFile2 = readLinesFromFile(file2Path);

            // Identify missing lines in File2
            Set<String> missingLines = new LinkedHashSet<>(linesInFile1);
            missingLines.removeAll(linesInFile2);

            // Print missing lines
            for(String line: linesInFile1) {
            	//for(String line1: linesInFile2) {
            		if(!line.trim().equals("{") && !linesInFile2.contains(line.trim())) {
                		System.out.println(line);                		
                	}
            	//}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Reads lines from a file and returns them as a set
    private static Set<String> readLinesFromFile(String filePath) throws IOException {
        Set<String> lines = new LinkedHashSet<>(); // LinkedHashSet maintains order

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line.trim()); // Trim whitespace for better comparison
            }
        }

        return lines;
    }
}
