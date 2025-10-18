/**
 * 
 */
package imports;

import java.util.Scanner;

import java.util.Random;

/**
 *  class outputs  use of operators/imports/selection statements to generate random responses
 */
public class Magic8ball {

	/**
	 * @param args
	 *  *  class outputs  use of operators/imports/selection statements to generate random responses
	 */
	public static void main(String[] args) {
		
		// set up scanner
		
		Scanner scanner = new Scanner(System.in);
		
		// set up random class
		
		Random random = new Random();
		
		// declare variables
		
		String userResponse;
		
		int responseNumber;
		
		// set up random number allocator
		
		responseNumber = random.nextInt(8) +1;
		
		// prompt for input
		
		System.out.println("What is your question?");
		
		userResponse = scanner.nextLine();
		
		System.out.println("You want to know...\n" + userResponse);
		
		// set up magic 8 ball 
		
		switch (responseNumber) {
		case 1 : System.out.println("As I see it, yes.");
		break;
		case 2 : System.out.println("Ask again later.");
		break;
		case 3 : System.out.println("Better not tell you now.");
		break;
		case 4 : System.out.println("Cannot predict now.");
		break;
		case 5 : System.out.println("Concentrate and ask again.");
		break;
		case 6 : System.out.println("Don't count on it.");
		break;
		case 7 : System.out.println("It is certain.");
		break;
		case 8 : System.out.println("It is decidedly so.");
		}
		
		scanner.close();
	

	}

}
