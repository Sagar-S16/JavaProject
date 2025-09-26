package inheritance;

class Phone1{
	void sing() {
		System.out.println("We can hear music in phone");
	}
}

class Samsung extends Phone1{
	void com() {
		System.out.println("We can communicate in phone");
	}
}

class Iphone extends Samsung{
	void watch() {
		System.out.println("we can watch movies in phone");
	}
	
}
public class MultiLevelInheritance {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Iphone p = new Iphone();
	p.watch();
	p.com();
	p.sing();
	
	

}

}
