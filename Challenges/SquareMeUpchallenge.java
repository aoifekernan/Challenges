/**
 * 
 */
package methods;

import java.util.Scanner;

/**
 * 
 */
public class SquareMeUpchallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Pick a side length for a box:");

		int length = scanner.nextInt();

		System.out.println("Pick a character to draw the box from:");

		char character = scanner.next().charAt(0);

		// draw top
		drawHorizontal(length, character);

		// draw side
		drawSides(length, character);

		drawHorizontal(length, character);

	}

	public static void drawHorizontal(int length, char character) {

		for (int loop = 1; loop <= length; loop++) {
			// change from println to print - this makes it not all print on one line
			System.out.print(character + "  ");

		}
		System.out.println();
	}

	public static void drawSides(int length, char character) {

		// print left side
		for (int loop = 0; loop < length - 1; loop++) {
			// change from println to print - this makes it not all print on one line
			System.out.println(character + "  ");
			System.out.print("   ");

			// now pad out middle - empty bit - nested for loop
			for (int side = 1; side < length - 1; side++) {
				System.out.print("   ");

			}
			// print out right side

			System.out.print(character);
			System.out.println();

		}

	}
}
