package collections;
import java.util.ArrayList;

import java.util.List;
public class ListExample {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		//add
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		System.out.println(fruits);
		
		//add(index,element)
		fruits.add(1,"orange");
		System.out.println(fruits);
		
		//get index
		System.out.println(fruits.get(2));
	
	
		//set(index element)
		fruits.set(2,"Grapes");
			System.out.println(fruits);
		
		// remove(index)
			fruits.remove(0);
			System.out.println(fruits);
		
		// remove Object
			fruits.remove("Mango");
			System.out.println(fruits);
			
		//size
		    System.out.println(fruits.size());
			
		//contains(Object)
			System.out.println(fruits.contains("Grapes"));
			
		//isEmpty()
			System.out.println(fruits.isEmpty());
			
		//indexOf(object)
			fruits.add("Orange");
			System.out.println(fruits);
			System.out.println(fruits.indexOf("Orange"));
			
		//lastIndexOf(objects)
			fruits.add("Orange");
			System.out.println(fruits.lastIndexOf("Orange"));
			
		//clear
			fruits.clear();
			System.out.println(fruits);
		}
	
	}



