import java.util.Scanner; //will allow you to read from the screen

//This Program will ask the user to enter a name and three scores.
//It will display a letter grade for each set of three scores and the average the scores.

public class GetAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner keyboard = new Scanner(System.in);
		
		
		
		int testScoreA;
		int testScoreB;
		int testScoreC;
		
		System.out.print("Enter your name: ");
		keyboard.next();
		
		System.out.print("Enter your first test score: ");
		testScoreA = keyboard.nextInt();
		System.out.print("Enter your second test score: ");
		testScoreB = keyboard.nextInt();
		System.out.print("Enter your third test score: ");
		testScoreC = keyboard.nextInt();
		
		double average = calcAverage(testScoreA,testScoreB, testScoreC);
		System.out.println("The average is: " + average +'%');
		determineGrade(average);
		keyboard.close();
		}
		
		public static double calcAverage(int testScoreA, int testScoreB, int testScoreC) 
	{
		double average =(testScoreA + testScoreB + testScoreC)/3;
		return average;
		
		
	}

		public static double determineGrade(double average)
	{
		if (average>90)
		{
			System.out.println("You got an A!");
		}
		else if (average>=80)
		{
			System.out.println("You got a B!");
		}
		else if (average>=70)
		{
			System.out.println("You got a C!");
		}
		else if (average>=60)
		{
			System.out.println("You got a D!");
		}
		else if (average<60)
		{
			System.out.println("You got an F!");
		}
				return average;
			
	}
	}
