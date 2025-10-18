/**
 * 
 */
package arrays;

/**
 * this class will produce a report of the number of zoo visitors of a 7 day
 * period. Informative info will be outputed to console.
 */
public class ZooVisitors {
	final static String RED = "\033[0;31m";
	final static String GREEN = "\033[0;32m";
	final static String BOLD = "\033[1m";
	final static String RESET = "\033[0m";

	/**
	 * * Start point of class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] zooVisitors = { 123, 118, 128, 175, 205, 256, 229 };
		String[] daysofWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		System.out.println("Zoo Weekly Visitors Report");
		System.out.printf(BOLD + "-----------------------------------\n");
		printdailyVisitors(zooVisitors, daysofWeek);
		System.out.printf(BOLD + "-----------------------------------\n");

		System.out.println(BOLD + "Total visitors: \t" + RESET + totalVisitors(zooVisitors));
		averageVisitors(zooVisitors);
		quietestDay(zooVisitors, daysofWeek);
		busiestDay(zooVisitors, daysofWeek);

	} // end of main method

	/**
	 * this method prints to console the number of visitors to the zoo for each day
	 * of the week
	 * 
	 * @param visitors
	 * @param days
	 */

	public static void printdailyVisitors(int[] visitors, String[] days) {

		for (int day = 0; day < days.length; day++) {
			System.out.println(BOLD + days[day] + RESET + ": \t " + visitors[day]);
		}

		/**
		 * this method calculates the total number of visitors over the defined period
		 */
	}

	public static int totalVisitors(int[] vistors) {

		int sum = 0;
		for (int loop = 0; loop < vistors.length; loop++) {
			sum += vistors[loop];
		}

		return sum;
	}

	/**
	 * calculates the average number of visitors across the week
	 * 
	 * @param visitors
	 */

	public static void averageVisitors(int[] visitors) {

		double average = (double) totalVisitors(visitors) / visitors.length;
		System.out.println(BOLD+"Average vistors: \t" +RESET +Math.round(average));

	}

	public static void busiestDay(int[] visitors, String[] dayofWeek) {

		int max = visitors[0];
		String day = dayofWeek[0];
		for (int i = 1; i < visitors.length; i++) {
			if (visitors[i] > max) {
				max = visitors[i];
				day = dayofWeek[i];

			}

		}
		System.out.println(BOLD + "Busiest day: \t" + RESET + RED + day + RESET + " (" + max + ")");

	}

	public static void quietestDay(int[] visitors, String[] dayofWeek) {

		int min = visitors[0];
		String day = dayofWeek[0];
		for (int i = 1; i > visitors.length; i++) {
			if (visitors[i] < min) {
				min = visitors[i];
				day = dayofWeek[i];

			}

		}
		System.out.println(BOLD + "Quietest day: \t" + RESET + GREEN + day + RESET + " (" + min + ")");

	}
}