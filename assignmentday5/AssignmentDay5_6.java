package assignmentday5;


import java.util.ArrayList;
class Product {
    private int productId;
    private String productName;
    private double price;

   
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

   
    public void display() {
        System.out.println("Product ID: " + productId +
                           ", Name: " + productName +
                           ", Price: ₹" + price);
    }
}

public class AssignmentDay5_6 {
    public static void main(String[] args) {
      
        ArrayList<Product> products = new ArrayList<>();

       
        products.add(new Product(101, "Laptop", 55000.00));
        products.add(new Product(102, "Smartphone", 25000.00));
        products.add(new Product(103, "Headphones", 1500.00));
        products.add(new Product(104, "Smartwatch", 5000.00));
        products.add(new Product(105, "Camera", 30000.00));
      

       
        System.out.println("Product List:");
        for (Product product : products) {
            product.display();
        }
    }
}


