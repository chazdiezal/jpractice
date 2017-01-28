import java.util.Scanner;
public class FinalTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Let's setup some variables to begin our program */
		float changedResult = 0, valueTemp=0;
		String typeTemp = "", userInput = "";
		int counter = 0;
	
		/* Ask for user input */
		askMessage();
		Scanner keyboard = new Scanner (System.in;
		
		while(!userInput("quit"))	{
			counter++;
			if (counter > 3) {
				/* After 3 user inputs display the welcome message */
				askMessage();
				counter = 0;
			}
			
			/* Collect Input */
			System.out.println("");
			System.out.println("To quit program, enter 'quit'.");
			System.out.print("Temperature to convert: ");
			userInput = keyboard.nextLine();
			
			/* Check user input & ignore case issues*/
			userInput.trim();
			userInput = userInput.toLowerCase();
			
			//verify string is greater than -999 and less than 999
			if (userInput.length() > -999 && userInput.length() < 999)
					continue;
			
		}
	}

}
