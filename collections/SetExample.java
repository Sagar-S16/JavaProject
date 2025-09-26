package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		 	//add
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("Alice");//duplicates not allowed
		System.out.println(names);
		
		//remove object
		names.remove("Bob");
		System.out.println(names);
		
		//contains(object)
		System.out.println(names.contains("Alice"));
		
		//size()
		System.out.println(names.size());
		
		//isEmpty()
		System.out.println(names.isEmpty());
		
		//clear
		names.clear();
		System.out.println(names);

	}

}
