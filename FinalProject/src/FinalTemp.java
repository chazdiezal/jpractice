import java.util.Scanner;
public class FinalTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Let's setup some variables to begin our program */
		float convTemp = 0, valueTemp=0;
		String typeTemp = "", userInput = "";
		int counter = 0;
	
		/* Ask for user input */
		askMessage();
		Scanner keyboard = new Scanner (System.in);
		
		while(!userInput.equals("quit"))	{
			counter++;
			if (counter > 3) {
				/* After 3 user inputs display the welcome message again */
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
			
			//Verify string is greater than -999 and less than 999
			if (userInput.length() > -999 && userInput.length() < 999)
					continue;
			else {
				System.out.println("Error: Please enter a value between -999 and 999.");
			}
			
			//Now let's split the input so we can perform error checking
			typeTemp = userInput.substring(userInput.length()-1);
			try {
				valueTemp = Float.parseFloat(userInput.substring(0, userInput.length()-1));
				
			}	catch (NumberFormatException nfe)	{
					if ((!userInput.equals("quit")))
						System.out.println("Thanks for using my program!");
					continue;
			}
			
			/*Let's calculate the output */
			calculateOutput(typeTemp, valueTemp);
		}
		
		/* End main method */
		System.out.println("");
		System.out.println("Thanks, your input is accepted!");
		
	
	
	
	
	}
	
	//Calculates and outputs the converted temp. 
	private static void calculateOutput(String typeTemp, float valueTemp) {
		// TODO Auto-generated method stub
		String outConvert = "", outType = "";
		float convTemp = 0;
		typeTemp = typeTemp.toLowerCase();
		
		if (typeTemp.equals("c")) {
			//convert to Fahrenheit
			convTemp = 9 * valueTemp /5 + 32;
			outConvert = " Celcius";
			outType = " Fahrenheit ";
		}
		else {
			System.out.println("Please specify C(celcius)");
	
	//Displays the output to screen
			System.out.println("");
			System.out.println(valueTemp + outConvert + "is" + convTemp + outType);
			return;
		}
	}
	
	//Prints the welcome message
	private static void askMessage() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("Please enter a numerical temperature.");
		System.out.println("Enter F/f for fahrenheit");
		return;
	}
	
	
	
	}


