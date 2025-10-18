/**
 * 
 */
package arrays;

import java.util.Arrays;

/**
 * 
 */
public class CodeBreaker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String name = "Aoife Kernan";
		
		int [] coded = createCode(name);
		System.out.println(Arrays.toString(coded));
		char[] uncoded = decodeCode(coded);
		System.out.println(Arrays.toString(uncoded));


			
		}
	
	public static int[] createCode (String name) {
	
	int [] coded = new int [name.length()];
	for (int i = 0; i < coded.length; i++) {
		coded[i] = (int) name.charAt(i);
		
	}
	return coded;

	}
	
	public static char [] decodeCode (int [] coded) {
		
		char [] uncoded = new char [coded.length];
		for (int i = 0; i < coded.length; i++) {
			uncoded[i] = (char) coded[i];
			
			
			
		}
		return uncoded;
		
	}
	
}

