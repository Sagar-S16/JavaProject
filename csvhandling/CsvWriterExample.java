package csvhandling;

import java.io.FileWriter;
import java.io.IOException;
 
public class CsvWriterExample {
    public static void main(String[] args) {
        String file = "students.csv";
 
        try (FileWriter fw = new FileWriter(file)) {
            // Write header
            fw.write("ID,Name,Marks\n");
 
            // Write records
            fw.write("1,Alice,85\n");
            fw.write("2,Bob,70\n");
            fw.write("3,Charlie,90\n");
 
            System.out.println("CSV file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}