package chapter3date;


import java.util.Scanner;

public class DateTest {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		//Date date = new Date();
		System.out.println("Display Sep 16, 2015 in MM/DD/YY");
		Date date = new Date(9, 16, 15);//initialize date
		date.displayDate();
		
		System.out.print("Input Month(MM): ");//prompt
		int userinput = input.nextInt();//get user input
		
		System.out.printf("%nchanging Month to %d%n%n", userinput);
		date.setMonth(userinput);//set month to user input
		
		date.displayDate();//display date MM/DD/YY
		
		
		System.out.print("Input Day(DD): ");//prompt
		userinput = input.nextInt();//get user input
		
		System.out.printf("%nchanging Day to %d%n%n", userinput);
		date.setDay(userinput);//set month to user input
		
		date.displayDate();//display date MM/DD/YY

		

		System.out.print("Input Year(YY): ");//prompt
		userinput = input.nextInt();//get user input
		
		System.out.printf("%nchanging Year to %d%n%n", userinput);
		date.setYear(userinput);//set month to user input
		
		date.displayDate();//display date MM/DD/YY
	}

}
