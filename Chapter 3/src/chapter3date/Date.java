package chapter3date;

/*3.14 - Date Class
Create a class called Date that includes three instance variables - a month(type int), a day (type int)
and a year(type int). Provide a constructor that initializes the three instance variables and assumes 
that the values provided are correct. Provide a set and a get method for each instance variable. 
Provide a method displayDate that displays the month, day and year separated by forward slashes (/).
Write a test app named DateTest that demonstrates class Date's capabilities.  */

public class Date {
	public int month, day, year;
	
	Date()//default constructor
	{
		
	}
	Date(int setMonth,int setDay,int setYear)//constructor to assign variables
	{
		month = setMonth;
		day = setDay;
		year = setYear;
	}
	
	//set methods to assign for each variable seperately
	public void setMonth(int setMonth)
	{
		month = setMonth;
	}
	public void setDay(int setDay)
	{
		day = setDay;
	}
	public void setYear(int setYear)
	{
		year = setYear;
	}
	
	//get methods to return values of each variable seperately
	public int getMonth()
	{
		return month;
	}
	public int getDay()
	{
		return day;
	}
	public int getYear()
	{
		return year;
	}
	
	//method that displays the date with forward slashes MM/DD/YY
	public void displayDate()
	{
		System.out.printf("The date is: %d/%d/%d%n%n", month, day, year);
	}
	

}

