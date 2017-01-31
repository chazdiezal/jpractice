import java.util.Scanner;

public class TempConversion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Let's setup some variables
		int degreeValue;
		String typeOfConversion;
		double result;
		String answer;
		
		//Gather user input
		Scanner keyboard = new Scanner(System.in);
		
		
		
		//Start do-while loop
		do
		{
			
				System.out.println("=========Temp Conversion=========");
				System.out.println();
				System.out.println("Please enter a value between -999 and 999 for");
				System.out.println("conversion.  You will be asked");
				System.out.println("what type of conversion you want to");
				System.out.println("perform in the next step:");
				System.out.println();
				
				degreeValue = keyboard.nextInt();
				if (degreeValue >= -999 || degreeValue <= 999);
				
					
				
				
		/**Calculations
		*   C= 5.0 (degrees Fahrenheit) - 32.0 / 9.0
		*   F= (9.0 (degrees Celsius) / 5.0) + 32.0
		*/
		
		
					boolean typeOfConversionInputIsInvalid = true;
					while (typeOfConversionInputIsInvalid)
					{
						System.out.println();
						System.out.println();
						System.out.println("Please enter either \"C\" or \"c\" for a");
						System.out.println("Celsius-Fahrenheit conversion, or \"F\" or \"f\"");
						System.out.println("for a Fahrenheit-Celsius conversion:");
							System.out.println();
							
							typeOfConversion = keyboard.next();
							
							switch (typeOfConversion.charAt(0))
							{
							case 'C':
							case 'c':
								result = (9.0 * ((double)degreeValue) / 5.0) + 32.0;
								System.out.println();
								System.out.println(degreeValue + " degrees" + " Celsius is " + result + " degrees " + "Fahrenheit");
								typeOfConversionInputIsInvalid = false;
								break;
							case 'F':
							case 'f':
								result = 5.0 * ((double)degreeValue - 32.0) / 9.0;
								System.out.println();
								System.out.println(degreeValue + " degrees" + " Fahrenheit is " + result + " degrees " + "Celsius");
								typeOfConversionInputIsInvalid = false;
								break;
							default:
							System.out.println();
								System.out.println();
								System.out.println("Error: Your entry is invalid.  Please try again,");
								System.out.println("Continue?");
								typeOfConversionInputIsInvalid = true;
								break;
							}
				}
				
				System.out.println();
				System.out.println();
				System.out.print("Would you like to do another conversion? ");
				System.out.println(" Please enter \"yes\" or \"no\":");
				System.out.println();
				
				answer = keyboard.next();
				
				
		} while (answer.equalsIgnoreCase("yes"));
		
			keyboard.close();
		}			
		
}	
	

	
	
		
		
		
		
		
							
	
		/**
		 * if (degreeValue > -999 && degreeValue < 999) {
						continue;
					} else {
						System.out.println("Please enter a valid number");
						return;
					}
					
			catch (degreeValue >= -999 && degreeValue <= 999){
					System.out.println("Thank you.  Your input has been accepted. ");
				}
				catch (degreeValue < -999 || degreeValue >999) {
					throw new NumberFormatException("Input is out of valid range.");
				}
			
			finally {
				    if (answer != null) { 
				        System.out.println("Closing PrintWriter");
				        keyboard.close(); 
				    } else { 
				        System.out.println("PrintWriter not open");
				    }		
		 */
		
	
			

