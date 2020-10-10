import java.util.Arrays;

public class week3project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ages = {3, 9, 23, 64, 2, 8, 27, 28, 93};

		
		System.out.println(ages[ages.length-1] - ages[0]);
	    
		int sum = 0;
		for(int i=0; i <ages.length; i++) 
			sum = sum + ages[i];
			int average = sum / ages.length;
			System.out.println("The average of this array is " + average);
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob",};
		

		int results = 0;
		for (String average1 : names ) { 
		
			if(!average1.contains(" ")) {
				results += average1.length();
				System.out.println(results);
			}else {
				results += average1.length() -1;
			}
		
		}
		int namesLen = names.length; // getting len of array which is 6
		
		int average1 =  results/namesLen; // get avg 23 / 6 = 4ish? 
		System.out.println("avg: "+ average1);
			
		
		
		String list = "";	
		for(int j=0; j < names.length;j++) {
		list += names[j]+" ";}
		
		System.out.println(list);
		//concatenate the string names

		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));
		//iterate through names and get length of each
		
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
			//sum of elements in array
		}
	System.out.println("The sum of nameLengths[] = " +sum);
	
	System.out.println("Sum greater than 100" + sumGreaterThan100(ages));
	
	double[]doubleArray = {10.8, 68.9, 40.7};
	double []doubleArray2 = {10.0};
	System.out.println(calculateAverage(doubleArray));
	System.out.println(firstIsGreater(doubleArray, doubleArray2));
	
	boolean isHotOutside = true;
	double moneyInPocket = 20.30;
	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	
	int year = 2020;
	System.out.println(isLeapYear(year));
	//Printing whether it is a leap year or not
	
		}
	
	

		public static String createFullName(String firstName, String lastName) {
			String fullName = firstName + " " + lastName;
			return fullName;
			//method for creating full name
		}
		public static String moreStrings(String word, int n) {
			String results = "";
			for (int i = 0; i < n; i++) {
				results += word;
			}
			return results;
			//method for printing String n number of times
		}
		
		
			public static Boolean sumGreaterThan100(int[] arr) {
				return Arrays.stream(arr).sum() > 100;
		
		
		
		
		}
		public static double calculateAverage(double[]numbers) {
			double sum = 0;
			for (double number : numbers) {
				sum += number;
			}
			return sum / numbers.length;
			// returning the average of a double array
			
		}
		public static double averages(double[]numbers1, double []numbers2) {
		double sum1 = 0;
		double sum2 = 0;
		for (double numberA : numbers1){
			sum1 +=numberA;
		}
		for (double numberB : numbers2){
			sum2 += numberB;
		}
		return (sum1+sum2)/(numbers1.length + numbers2.length);
			
		
		}
		public static boolean firstIsGreater(double[] firstArray, double[] secondArray) {
			return calculateAverage(firstArray) > calculateAverage(secondArray); 
		
		}
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			return isHotOutside && moneyInPocket > 10.5;
			
		}
		public static boolean isLeapYear(int year) {
		boolean a = (year % 4) == 0;
		boolean b = (year % 100) == 0;
		boolean c = ((year%100)==0 && (year % 400 == 0));
		return a && (b||c);
		//this returns true if all these conditions are true, which are the conditions for a leap year.
		//I always thought this was an interesting group of equations for a leap year,
		//and I thought it transfered well to coding and methods.
		}
		
}
		

		
		
	
	
			
			
			
			
			
	     //codewars codesignal leetcode 400! || -  || {{0,1,3}, {0,0,0}}
//  {1 * *}
//  {* * 9}




