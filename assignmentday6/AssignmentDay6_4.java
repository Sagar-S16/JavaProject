package assignmentday6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AssignmentDay6_4 {
    public static void main(String[] args) {
        String filePath = "C:/Users/DELL/Desktop/excel/text.txt";
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/DELL/Desktop/excel/text.txt"))) {
            String line;

            
            while ((line = reader.readLine()) != null) {
                
                String[] words = line.trim().split("\\s+");

                
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("Total number of words in the file: " + wordCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

