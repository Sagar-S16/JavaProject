package program_fundamentals;

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//If
		double cartValue = 1200;
		if(cartValue > 1000) {
			System.out.println("You are eligible for a gift");
		}
		
		//If - else 
		boolean isPremiumMember = true;
		if(isPremiumMember) {
			System.out.println("you got 20% discount as a premium member");
		}
		else {
			System.out.println("5% discount as a regular member");
		}
		
		//If- Else ladder
		int points = 850;
		if(points<200) {
			System.out.println("Bronze member");
		}
		else if (points<500) {
			System.out.println("Silver member");
		}
		else if(points<1000) {
			System.out.println("Gold member");
		}
		else  {
			System.out.println("Platinum member");
		}
		
		
		
		//Traditional Statements
		int Upi = 2;//1=credit card , 2 = UPI , 3 = wallet
		switch(Upi) {
		case 1:
			System.out.println("Payment by credit card");
			break;
		
	    case 2:
		System.out.println("Payment by Upi");
		break;
		
	    case 3:
	    	System.out.println("Payment by wallet");
	    	break;
	    	
	    	default:
	    		System.out.println("Payment method not recognised");
	}
		
		
		//Enhanced Switch
		int deliveryDay = 6; //1=Mon , 2=Tue ... 6=Sat,7=Sun
		String deliveryType = switch(deliveryDay) {
		case 1,2,3,4,5 -> "Weekend Delivery - Standard Shopping";
		case 6,7 -> "Weekend Delivery - Extra charges Apply";
		default -> "Invalid day selected for Delivery";
};
      System.out.println(deliveryType);
      
      
      
      
	}}







 	
 	