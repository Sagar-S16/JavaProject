package filehandling;

import java.io.FileWriter;
import java.io.IOException;
 
public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("ExampleOutput.txt");
            writer.write("Hello this is written using FileWriter!\n");
            writer.write("Java File Handling Example.");
            writer.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}