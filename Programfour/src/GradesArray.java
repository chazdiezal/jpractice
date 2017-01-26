import java.util.*; 

public class GradesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nameArray = new String[] {"Jon ","Rajesh ","Elizabeth ","Julio ","Chang "};
	    String[] gradeArray = new String[5];
		double[] score1Array = {72, 60, 45, 70, 89};
		double[] score2Array = {50, 70, 60, 85, 90};
		double[] score3Array = {70, 80, 90, 100, 100};
		double[] averageArray = new double[5];
	      for (int i = 0; i < 5; i++)  //why 4
	      {
	    	     averageArray[i] = (score1Array[i] + score2Array[i] + score3Array[i])/3;
	    	     if (averageArray[i] > 90.0)
	    		{
	    	gradeArray[i] = "A ";
	    		} else if (averageArray[i] > 80.0)
	    	{
	    	gradeArray[i] = "B ";
	    	} else if (averageArray[i] > 70.0)
	    	{
	    	gradeArray[i] = "C ";
	    	} else if (averageArray[i] > 60)
	    	{
	    	gradeArray[i] = "D ";
	    	      }
	    	else
	    	{
	    	gradeArray[i] = "F ";
	    	}
	    	System.out.print("Name is: " +  nameArray[i] + "Grade is: " + gradeArray[i] + "Average is: " + averageArray[i] );
	    	}

	}

}
