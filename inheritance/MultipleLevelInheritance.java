package inheritance;

interface Printable{
	void Print();
}
interface Showable{
	void show();
}

	class Demo implements Printable,Showable{
		@Override
		public void Print() {
			System.out.println("Hello from Printable");
		}
		@Override
		public void show() {
			System.out.println("Hello from show");
		}

}
	public class MultipleLevelInheritance {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Demo d = new Demo();
			d.Print();
			d.show();
	
		}
	
	}
