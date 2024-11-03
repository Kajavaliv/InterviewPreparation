package com.nokia;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileComparison {
    public static void main(String[] args) {
        String file2 = "C:\\Projects\\LLDP\\shared-yang-model-sros\\unittest\\set1\\telemetry\\tableNameMap.json";
        String file1 = "C:\\Projects\\LLDP\\shared-yang-model-sros\\build\\telemetry\\tableNameMap.json";
        
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));

            String line1 = reader1.readLine();
            String line2 = reader2.readLine();

            boolean areFilesIdentical = true;
            int lineNum = 1;

            while (line1 != null || line2 != null) {
                if (line1 == null || line2 == null) {
                    areFilesIdentical = false;
                    System.out.println("Files differ at line " + lineNum);
                    System.out.println("File 1: " + (line1 == null ? "End of File" : line1));
                    System.out.println("File 2: " + (line2 == null ? "End of File" : line2));
                    break;
                } else if (!line1.equals(line2)) {
                    areFilesIdentical = false;
                    System.out.println("Files differ at line " + lineNum);
                    System.out.println("File 1: " + line1);
                    System.out.println("File 2: " + line2);
                }

                line1 = reader1.readLine();
                line2 = reader2.readLine();
                lineNum++;
            }

            if (areFilesIdentical) {
                System.out.println("The files are identical.");
            }

            reader1.close();
            reader2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
