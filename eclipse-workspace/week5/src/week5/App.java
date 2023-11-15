package week5;

public class App {

	public static void main(String[] args) {

		// Instantiated one of each class to test.
		AstriskLogger aLogger = new AstriskLogger();
		SpacedLogger sLogger = new SpacedLogger();
		
		// I decided to use the classic "Hello, world!" string to test the classes.
		String testString = "Hello, world!";
		
		// Testing the AstriskLogger class.
		System.out.println("Testing AsteriskLogger class:");
		aLogger.log(testString);
		aLogger.error(testString);
		System.out.println("Test complete.\n"); // newline character added for legibility in the console.
		
		//Testing the SpacedLogger class.
		System.out.println("Testing SpacedLogger class:");
		sLogger.log(testString);
		sLogger.error(testString);		
		System.out.println("Test complete.\n"); // newline character added for legibility in the console.
		
		

	}

}
