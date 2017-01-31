import java.io.*;  //needed to handle files
public class testfiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// The name of the file to open.
	String fileName = "S:\\charles\\School\\Inf231\\week5\\week5file.txt";
	
// This will reference one line at a time
		String line = null;
		
		
//below is the error handling if the file does not exist
		try {
			System.out.println("Charles");
			FileReader filereader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(new FileReader("S:\\charles\\School\\Inf231\\week5\\week5file.txt"));
		while((line = bufferedReader.readLine()) != null)	{
			System.out.println(line);
		}
		bufferedReader.close();  //closing file after processing
		
		}
		
		//error if the file does not exist
		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file '");
		}
		catch(IOException ex) {
			System.out.println( "Error reading file ");
		
		}
	}

}
