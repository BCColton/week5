// author: Brian Colton 



package week4;

// Exercises and solutions to the week4
// exercises will be found below

public class week4 {

	public static void main(String[] args) {
		
		/*
		 * To keep the main method clean the Coding Steps
		 * have been delegated to their own methods unless
		 * it makes more sense to combine. Combinations will
		 * be noted in method name.
		 */
		
		// Values needed to test function calls
		int[] nums = {10, 10, 20, 20, 30, 40, 50};
		double[] doubleNums = {10, 10, 20, 20, 30, 40, 50};
		double[] otherDoubleNums = {10, 10.5, 22, 14, 11, 8};
		
		// Methods that print inside the method body
		stepOne();
		stepTwo();
		stepThreeAndFour();
		stepFiveAndSix();
		
		// Methods that return values that need to be printed to be checked.
		// Contains methods for step seven through step thirteen respectively.
		System.out.println(returnWordNTimes("Hello, World!", 10));
		System.out.println(fullName("Hello", "World"));
		System.out.println(sumGreaterThan100(nums));
		System.out.println(avg(doubleNums));
		System.out.println(greaterAVG(doubleNums, otherDoubleNums));
		System.out.println(willBuyDrink(true, 12));
		System.out.println(XOR(true, false));
		
	}
	
	//@stepOne
	public static void stepOne() {
		
		//part a
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; // Declared integer array that has been instantiated with an array literal.
		System.out.println(ages[ages.length - 1] - ages[0]); // Expected value of 90.
		
		//part b
		int[] agesPlusOne = {3, 9, 23, 64, 2, 8, 28, 93, 31}; // Integer array one size greater than ages.
		System.out.println(agesPlusOne[agesPlusOne.length - 1] - agesPlusOne[0]); // Expected value of 28.
		
		//part c
		int result = 0; // Declared integer to store the sum of the values stored in the array instantiated to 0.
		
		for (int i = 0; i < agesPlusOne.length; i++) { // Standard array loop logic
			result += agesPlusOne[i]; // Stores the sum of "result" and the value at i back into "result".
		}
		
		System.out.println(result/(agesPlusOne.length)); // Expected value of 29.
	
	}
	
	//@stepTwo
	public static void stepTwo() {
		
		//part a
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; // Declared String array instantiated with an array literal.
		
		for (int i = 0; i < names.length; i++) { // Standard array loop logic
			System.out.println(names[i]); // Prints the String value at i with a newline character
		}
		
		//part b
		String result = ""; // Declared a string and instantiated it with an empty string literal to store the values in the names array.
		
		for (int i = 0; i < names.length; i++) {
			result += names[i] + " "; // A space character is included in the concatenation for legibility.
		}
		
		System.out.println(result); // Expected result of the values stored in names with basic formatting.
	}
	
	//@stepThreeAndFour
	public static void stepThreeAndFour() {
		
		//@stepThree
		System.out.println("The last element of an array is accessed programmatically");
		System.out.println("by accessing the element at the arrayName.length - 1 index.");
		System.out.println("Example: names[names.length - 1]");
	
		//@stepFour
		System.out.println("The first element of an array is accessed by accessing the");
		System.out.println("element at index 0"); 
		System.out.println("Example: names[0]");
	
	}
	
	//@stepFiveAndSix
	public static void stepFiveAndSix() {
		
		//@stepFive
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; // Copied from previous method
		int[] nameLengths = new int[names.length]; // Array of integers instantiated as a "new" array with the same length as the names array
	
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); // Calculates the size of a stored string and stores that value in the
												// correlating slot in nameLengths array. This works without needing 
												// size checking because we ensured the arrays sizes are the same.
		}
		
		//@stepSix
		int result = 0; // Declared integer instantiated with a value of 0 to use as a store
		
		for (int i = 0; i < nameLengths.length; i++) {
			result += nameLengths[i]; // Adding the value at index i to result and storing it back in result.
		}

		System.out.println(result); // Expected value of 23.
		
	}	
	
	//@stepSeven
	public static String returnWordNTimes(String word, int n) {
		
		String result = ""; //Declare and instantiate an empty string to act as storage for our result.
		
		// Loop runs for our integer parameter number of times.
		for (int i = 0; i < n; i++) {
			result += word; // Concatenating the String parameter to our result String.
		}
		
		return result;
	}
	
	//@stepEight
	public static String fullName(String first, String last) {
		
		return first + " " + last; // Given String parameters are concatenated with a space character between them and returned.
			
	}
	
	//@stepNine
	public static boolean sumGreaterThan100(int[] nums) {
		
		int result = 0; // Declared and instantiated integer with value 0 to act as a store of value.
		
		for (int i = 0; i < nums.length; i++) {
			result += (nums[i]); // Summing the value of result and nums[i] and storing the value back in result.
		}
		
		return result > 100; // Returns true if result is greater than 100, else returns false.
	}
	
	//@stepTen
	public static double avg(double[] nums) {
		
		double result = 0; // Declared and instantiated double with value of 0 to act as a store of value.
		
		for (int i = 0; i < nums.length; i++) {
			result += nums[i]; // Sums the value of result and nums[i] and stores the value back in result.
		}
		
		return result / nums.length; // Returns the value of result divided by the length of nums to get the array arithmetic average.
		
	}
	
	//@stepEleven
	public static boolean greaterAVG(double[] a, double[] b) {
		
		return avg(a) > avg(b); // Utilizes the method from step ten to calculate the averages of the double arrays
								// and returns true if the average of a is greater than b, else false.
				
	}
	
	//@stepTwelve
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {

		return isHotOutside && moneyInPocket > 10.5; // Utilizes the logical AND operator to check the boolean value isHotOutside
													 // to the boolean value returned by the comparison of moneyInPocket to 10.5.
	
	}
	
	//@stepThirteen
	public static boolean XOR(boolean a, boolean b) {
		
		return (a && !b) || (!a && b); // Utilizes logical AND, OR, and NOT operators to implement an exclusive OR gate
										// which returns true if only one of the given boolean parameters is true, else
										// returns false. This has it's own operator in Java: '^' which is used for what
										// is known as bitwise operation. This method gives insight into the exclusive OR.
	
	}
}
