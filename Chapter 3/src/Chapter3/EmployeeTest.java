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

import java.util.Scanner;
public class EmployeeTest {

	private static Scanner input;

	public static void main(String[] args) {

		Employee employee1, employee2;
		input = new Scanner(System.in);
		
		//get information from user in regards to the information of the first employee
		System.out.print("input first employee's first name: ");
		String firstName = input.next();
		System.out.print("input first employee's last name: ");
		String lastName = input.next();
		System.out.print("input first employee's monthly salary: ");
		double salary = input.nextDouble();
		employee1 = new Employee(firstName, lastName, salary);
		
		//get information from the user in regards to the information of the second employee
		System.out.print("input second employee's first name: ");
		firstName = input.next();
		System.out.print("input second employee's last name: ");
		lastName = input.next();
		System.out.print("input second employee's monthly salary: ");
		salary = input.nextDouble();
		employee2 = new Employee(firstName, lastName, salary);
		
		//print out the information of the employees received from the user
		System.out.printf("%n%s's salary is %.2f.%n", employee1.getFullName(), employee1.getSalary());
		System.out.printf("%n%s's salary is %.2f.%n", employee2.getFullName(), employee2.getSalary());
		
		//increase the salary of both employees by %10
		employee1.raiseSalary(10); //raise salary 10%
		employee2.raiseSalary(10);//raise salary 10%
		
		//print out the employees and their salaries after the increase
		System.out.printf("%n%s's salary after raise is %.2f.%n", employee1.getFullName(), employee1.getSalary());
		System.out.printf("%n%s's salary after raise is %.2f.%n", employee2.getFullName(), employee2.getSalary());
		
		
	}
	

}
