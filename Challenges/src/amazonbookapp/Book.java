/**
 * 
 */
package amazonbookapp;

/**
 * 
 */
public class Book {

	// Designing and creating a real world class
	// info requires you to design and code a class that would support a book in a
	// real-world application.
	// As part of an application you have be tasked to design a Java class to
	// represent the following selected data from an Amazon book ...
	// title, author, price, pages (number of), ISBN10, average customer rating,
	// language
	// Create a UML class diagram to represent the data to be represented
	// Code that class – create a default and a constructor that accepts all
	// arguments.

	private String title;
	private String author;
	private int numPages;
	private String iSBN10;
	private double averageRating;
	private String language;

	public Book() {

	}

	/**
	 * @param title
	 * @param author
	 * @param numPages
	 * @param iSBN10
	 * @param averageRating
	 * @param language
	 */
	public Book(String title, String author, int numPages, String iSBN10, double averageRating, String language) {
		super();
		this.title = title;
		this.author = author;
		this.numPages = numPages;
		this.iSBN10 = iSBN10;
		this.averageRating = averageRating;
		this.language = language;
	}

	/**
	 * @return the book title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param sets the book title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the book author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param sets book author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the number of pages in the book
	 */
	public int getNumPages() {
		return numPages;
	}

	/**
	 * @param sets the number of pages in the book
	 */
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	/**
	 * @return the book's ISBN10
	 */
	public String getISBN10() {
		return iSBN10;
	}

	/**
	 * @param sets the ISBN10
	 */
	public void setISBN10(String iSBN10) {
		this.iSBN10 = iSBN10;
	}

	/**
	 * @return the average rating of the book
	 */
	public double getAverageRating() {
		return averageRating;
	}

	/**
	 * @param average rating
	 */
	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	/**
	 * @return the language of the book
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", numPages=" + numPages + ", iSBN10=" + iSBN10
				+ ", averageRating=" + averageRating + ", language=" + language + "]";
	}


}
