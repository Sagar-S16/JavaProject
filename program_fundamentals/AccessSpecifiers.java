package program_fundamentals;


 public class AccessSpecifiers{
	public int x = 10;
	private int y = 20;
	protected int z = 30;
	int w = 40;
 
public void showValues() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
	}
public static void main(String[] args) {
		AccessSpecifiers d = new AccessSpecifiers() ;
		System.out.println(d.x);
		//System.out.println(d.y);
		System.out.println(d.z);
		System.out.println(d.w);
		System.out.println();
		d.showValues();
			
		
	}
}
