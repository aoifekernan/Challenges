/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * 
 */
public class VowelCounter {

	final static char[] VOWELS = { 'a', 'o', 'i', 'e', 'u' };

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please input your name");

		String name = input.next();

		char [] letters = createArray(name);
		
		System.out.println("You have " +vowelCounter(letters) + " vowel(s) in your name");

	}
	
	/**
	 * method creates character array from  string
	 * @param name inputting from user
	 * @return
	 */

	public static char[] createArray(String name) {

		char [] letters = new char [name.length()];
		for (int i = 0; i < name.length(); i++) {
			letters[i] = name.charAt(i);

		}
		return letters;
	}
	
	/**
	 * counts how many vowels in a name
	 * @param letters
	 * @return
	 */
	
	public static int vowelCounter (char [] letters) {
	
	int count = 0;
	for (int i = 0; i < letters.length; i++) {
		 char current = Character.toLowerCase(letters[i]);
		if (current =='a' || current =='o' | current =='i' || current =='e' || current =='u') {
			count++;
		}
		
	}
	return count;
	
	}

}