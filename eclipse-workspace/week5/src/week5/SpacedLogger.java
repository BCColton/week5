package week5;

public class SpacedLogger implements Logger {

	public void log(String str) {
		
		// Empty String as our result holder
		String output = "";
		
		// For loop merges our given String str with the space character " " and stores the value in output.
		// ends at second to last element of str. Last element will be concatenated outside of the loop.
		for (int i = 0; i < str.length() - 1; i++) {
			output += str.charAt(i) + " ";
		}
		
		// Adding our last element to the string
		output += str.charAt(str.length() - 1); 
		
		// Prints our output variable to the console.
		System.out.println(output);
		
	}
	
	public void error(String str) {
		
		// Empty String as our result holder
		String output = "";
				
		// For loop merges our given String str with the space character " " and stores the value in output.
		// ends at second to last element of str. Last element will be concatenated outside of the loop.
		for (int i = 0; i < str.length() - 1; i++) {
			output += str.charAt(i) + " ";
		}
				
		// Adding our last element to the string
		output += str.charAt(str.length() - 1); 
		
		// Prints our output variable to the console concatenated to "ERROR:
		System.out.println("ERROR: " + output);
	
	}

}