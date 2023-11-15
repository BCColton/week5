package week5;

public class AstriskLogger implements Logger {

	public void log(String str) {
		
		// Empty string to store our top and bottom rows of asterisks
		String boxEnd = "";
		
		// Loop adds asterisks into our boxEnd variable until it is the proper size to enclose our result.
		// +6 to our str length ensures we account for the additional 3 characters per side.
		for (int i = 0; i < str.length() + 6; i++) {
			boxEnd += "*";
		}
		
		// Print block that should give us our desired result.
		System.out.println(boxEnd);
		System.out.println("***" + str + "***");
		System.out.println(boxEnd);
		
	}
	
	public void error(String str) {
		
		// Empty String to store our top and bottom row of asterisks
		String boxEnd = "";
		str = "ERROR: " + str; 	// Added the ERROR: to the beginning of our given string
								// to give us the desired output.
		
		// identical for loop to the one in the log method. Snippet could be turned into its own method
		// to reduce repeat code.
		for (int i = 0; i < str.length() + 6; i++) {
			boxEnd += "*";
		}
		
		// Identical print block to method above. Also candidate for code repetition reduction
		System.out.println(boxEnd);
		System.out.println("***" + str + "***");
		System.out.println(boxEnd);
	
	}

}
