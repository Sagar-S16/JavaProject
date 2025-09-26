package assignmentday6;


import java.io.FileWriter;
import java.io.IOException;

public class AssignmentDay6_3 {
    public static void main(String[] args) {
        try {
        	FileWriter writer = new FileWriter("Welcome.txt");
        	writer.write("Hello, Java File Handling");
            writer.close();
         	System.out.println("File created and message written successfully.");
         	System.out.println("Hi my name is Sagar S and I am automation test Engineer from Healthasyst.");
        }   
            catch (IOException e) {
             System.out.println("An error occurred while writing to the file.");
             e.printStackTrace();
        }
    }
}

