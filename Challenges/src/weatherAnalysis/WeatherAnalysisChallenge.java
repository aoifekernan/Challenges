/**
 * 
 */
package weatherAnalysis;

/**
 * writing a java program to analyse for weather statistics, using variables,
 * operators and if statements
 */
public class WeatherAnalysisChallenge {

	/**
	 * program start ...
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// declaring variables

		double tempDay1, tempDay2, tempDay3, tempDay4, tempDay5, average;

		boolean sunDay1, sunDay2, sunDay3, sunDay4, sunDay5;
		
		int daysofSun;
		

		// initialisation

		tempDay1 = 15.5;
		tempDay2 = 10.5;
		tempDay3 = 16.0;
		tempDay4 = 12.5;
		tempDay5 = 17.0;

		sunDay1 = true;
		sunDay2 = false;
		sunDay3 = true;
		sunDay4 = true;
		sunDay5 = true;
		
		// average week temp
		 
		average = 0;
		
		daysofSun = 0;
		
		average = (tempDay1 + tempDay2 + tempDay3 + tempDay4 + tempDay5) / 5;
		
		if (sunDay1) {
			daysofSun = daysofSun + 1;
		}
		
		if (sunDay2) {
			daysofSun++;
		}
		if (sunDay3) {
			daysofSun++;

		}
		if (sunDay3) {
			daysofSun++;
		}
		
		if (sunDay4) {
			daysofSun++;
		}
		if (sunDay5) {
			daysofSun++;
		}

		System.out.println("Weather Analysis");
		System.out.println("---------------------");

		// day 1 stats

		System.out.println("Day 1");
		System.out.println("Temp\t : " + tempDay1);
		System.out.println("Sun\t : " + sunDay1);
		{
			if (tempDay1 > average)
				;
			System.out.println("Above Average Temp");
		}
		System.out.println("\n---------------------");
		System.out.println("Day 2");
		System.out.println("Temp\t : " + tempDay2);
		System.out.println("Sun\t : " + sunDay2);
		{
			if (tempDay2 > average)
				;
			System.out.println("Above Average Temp");
		}
		System.out.println("\n---------------------");
		System.out.println("Day 3");
		System.out.println("Temp\t : " + tempDay3);
		System.out.println("Sun\t : " + sunDay3);
		{
			if (tempDay3 > average)
				;
			System.out.println("Above Average Temp");
		}
		System.out.println("\n---------------------");
		System.out.println("Day 4");
		System.out.println("Temp\t : " + tempDay4);
		System.out.println("Sun\t : " + sunDay4);
		{
			if (tempDay4 > average)
				;
			System.out.println("Above Average Temp");
		}
		System.out.println("\n---------------------");
		System.out.println("Day 5");
		System.out.println("Temp\t : " + tempDay5);
		System.out.println("Sun\t : " + sunDay5);
		{
			if (tempDay5 > average)
				;
			System.out.println("Above Average Temp");
		}
		System.out.println("\n---------------------\n");
		
		System.out.println("Overall stats");
		System.out.println("Average Temp\t\t : " +average);
		System.out.println("Number days of sun\t : " +daysofSun);

	}

}
