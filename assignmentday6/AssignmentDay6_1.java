package assignmentday6;

public class AssignmentDay6_1 {

	public static void main(String[] args) {
        
        int[] productIds = {101, 102, 103, 104};

        try {
            System.out.println(productIds[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Error while accessing invalid index");
            System.out.println("Message : " + e.getMessage());
        }
        
        finally {
            
            System.out.println("Finished attempting to access product ID.");
        }
    }
}


