package week2lab2;
import java.util.Scanner;

public class AverageGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner keyboard = new Scanner(System.in);
	
	double testScore1;
	double testScore2;
	double testScore3;
	String name1;
	
	System.out.print("Enter your name: ");
	name1 = keyboard.next();
	
	
	System.out.print("Enter your first test score: ");
	testScore1 = keyboard.nextInt();
	System.out.print("Enter your second test score: ");
	testScore2 = keyboard.nextInt();
	System.out.print("Enter your third test score: ");
	testScore3 = keyboard.nextInt();
	keyboard.nextLine();
	double average =(testScore1 + testScore2 + testScore3)/3;
	System.out.println("Name: " + name1 );
	System.out.println("The average is: " + average);
	
	if(average > 90)
	System.out.println("You got an A!");
	else if(average>=80)
	System.out.println("You got a B!");
	else if(average>=70)
	System.out.println("You got a C!");
	else if(average>=60)
	System.out.println("You got a D!");
	else if(average<60)
	System.out.println("You got an F!");
	keyboard.close();
	}
	//end main method
}
