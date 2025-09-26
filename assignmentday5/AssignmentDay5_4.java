package assignmentday5;

import java.util.ArrayList;

public class AssignmentDay5_4 {
    public static void main(String[] args) {
        
        ArrayList<Integer> cart = new ArrayList<>();

       
        for (int i = 1; i <= 10; i++) {
            cart.add(i); 
        }

        System.out.println("Cart before removal: " + cart);

        
        cart.remove(Integer.valueOf(5));

        
        System.out.println("Cart after removal: " + cart);
    }
}


