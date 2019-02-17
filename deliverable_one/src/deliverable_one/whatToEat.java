package deliverable_one;
import java.util.Scanner;

public class whatToEat {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String eventType;
		int partySize;
		String result;
		
		System.out.println("Please enter the type of event you are "
				+ "having (casual, semi-formal, formal): ");
		//Get event type
		eventType = scnr.next();
		System.out.println("Please enter the size of your party");
		//Get party size
		partySize = scnr.nextInt();
		//loops until answer is casual, semi-formal,or formal
		while(!(eventType.equalsIgnoreCase("casual") || eventType.equalsIgnoreCase("semi-formal")
				|| eventType.equalsIgnoreCase("formal"))) {
			System.out.println("Please enter the type of event you are "
					+ "having (casual, semi-formal, formal): ");
			eventType = scnr.next();
			while(partySize <= 0) {
				System.out.println("Please enter the size of your party");
				//Get party size
				partySize = scnr.nextInt();
			}
		}
		//initialize String result with eventType and partySize
		result = "Since you're hosting a " + eventType + " event for "
				+ partySize + " participants, you should serve ";
			
		if(eventType.equalsIgnoreCase("casual")) {
			String tempString = "sandwiches";
			//sandwiches added to result string
			result = result.concat(tempString);
		}
		else if(eventType.equalsIgnoreCase("semi-formal")) {
			String tempString = "fried chicken";
			//fried chicken added to result string
			result = result.concat(tempString);
		}
		else if(eventType.equalsIgnoreCase("formal")) {
			String tempString = "chicken parmesan";
			//chicken parmesan added to result string
			result = result.concat(tempString);
		}
		else {
			// error message should not print because of loop
			System.out.println("Error, input not recognized.");
		}
		
		if(partySize == 1) {
			String tempString = " prepared in the microwave.";
			//add prepared in the microwave to result string
			result = result.concat(tempString);
		}
		else if(partySize >= 2 && partySize <= 12) {
			String tempString = " prepared in your kitchen";
			//add prepared in your kitchen to the result string
			result = result.concat(tempString);
		}
		else if(partySize > 12) {
			String tempString = " prepared by a caterer.";
			//add prepared by a caterer to the result string
			result = result.concat(tempString);
		}
		else {
			//error message should not print because there is a loop
			System.out.println("There was an error with your input.");
		}
		//output result string with new line
		System.out.println(result);
	}

}
