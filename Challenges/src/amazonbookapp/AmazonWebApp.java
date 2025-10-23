/**
 * 
 */
package amazonbookapp;

/**
 * 
 */
public class AmazonWebApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// test using data from Amazon website

		Book b1 = new Book("The Body", "Bill Bryson", 464, "0857522418", 4.7, "English");
		System.out.println(b1.toString());
		System.out.println();

		Book b2 = new Book("Ulysses", "James Joyce", 736, "1840226358", 4.3, "English");
		System.out.println(b2.toString());
		System.out.println();
		
		// test longest read method
		longestRead(b1, b2);

	}

	/**
	 * Method use the number of pages in each book to determine how long it will
	 * take to read, and output the longest read to screen.
	 * 
	 * @param book1 number of pages
	 * @param book2 number of pages
	 */

	public static void longestRead(Book b1, Book b2) {
		if (b1.getNumPages() > b2.getNumPages()) {
			System.out.println("Longest read: " + b1.getTitle());

		} else if (b1.getNumPages() == b2.getNumPages()) {
			System.out.println("Equal read time.");
		} else {
			System.out.println("Longest read: " + b2.getTitle());

		}
	}
}
