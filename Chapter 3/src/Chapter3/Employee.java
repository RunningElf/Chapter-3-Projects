package Chapter3;

/*3.13 - Employee Class 
Create a class called Emloyee that includes three instances variables - a first name (type String), 
a last name (type String) and a monthly salary (double). Provide a constructor that initializes the 
three instance variable. If the monthly salary is not positive, do not set its value. Write a test app
named EmployeeTest that demonstrates class Employee's capabilities. Create two Employee objects 
and display each objects' yearly salary. Then give each Employee a 10%  raise and display each
Employee's yearly salary again.

*
*/

public class Employee {
	String firstName, lastName;
	double monthlySalary;
	
	Employee()//default constructor
	{
		
	}
	Employee(String assignFirstName, String assignLastName, double assignMonthlySalary)//overload constructor
	{
		setName(assignFirstName, assignLastName);
		setSalary(assignMonthlySalary);
	}
	
	void setName(String assignFirstName, String assignLastName)//Assign first and last name
	{
		this.firstName = assignFirstName;
		this.lastName = assignLastName;
	}
	
	void setSalary(double assignMonthlySalary)//set the salary 
	{
		if(assignMonthlySalary>=0)//check to make sure the salary is not a negative
			this.monthlySalary = assignMonthlySalary;
	}
	
	String getFullName()//return first and last name
	{
		return firstName + " " +lastName;
	}
	String getFristName()//return first name
	{
		return firstName;
	}
	String getLastName()//return last name
	{
		return lastName;
	}
	double getSalary()//return current salary
	{
		return monthlySalary;
	}
	void raiseSalary(double raisePercentage)//accept percent to raise salary
	{
		this.monthlySalary *= (1+ (raisePercentage * .01)); //salary raised = current salary x 1.(percentage in decimals)
	}

}
