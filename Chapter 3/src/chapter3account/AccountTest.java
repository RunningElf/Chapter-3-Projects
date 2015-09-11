package chapter3account;

import java.util.Scanner;

public class AccountTest {


	private static Scanner input;

	public static void main(String[] args) {
		
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		input = new Scanner(System.in);
		
		//display initial balance of each object
		System.out.printf("%s balance: $%.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", 
				account2.getName(), account2.getBalance());
		
		
		
		System.out.print("Enter deposit amount for account1: ");//prompt
		double depositAmount = input.nextDouble();//obtain user input
		
		System.out.printf("%nadding %.2f to account1 balance%n%n", 
				depositAmount);
		account1.deposit(depositAmount);//add to account1's balance
		
		//display balances
		System.out.printf("%s balance: $%.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", 
				account2.getName(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");//prompt
		depositAmount = input.nextDouble();//obtain user input
		System.out.printf("%nadding %.2f to account2 balance%n%n", 
				depositAmount);
		account2.deposit(depositAmount);//add to account2 balance
		
		//display balances
		System.out.printf("%s balance: $%.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", 
				account2.getName(), account2.getBalance());
		
		
		
		System.out.print("Enter withdrawal amount for account1: ");//prompt
		double withdrawalAmount = input.nextDouble();//obtain user input
		
		System.out.printf("%nadding %.2f to account1 balance%n%n", 
				withdrawalAmount);
		account1.withdraw(withdrawalAmount);//subtract from account1 balance
		
		//display balances
		System.out.printf("%s balance: $%.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", 
				account2.getName(), account2.getBalance());
		
		System.out.print("Enter withdrawal amount for account2: ");//prompt
		withdrawalAmount = input.nextDouble();//obtain user input
		System.out.printf("%nadding %.2f to account2 balance%n%n", 
				withdrawalAmount);
		account2.withdraw(withdrawalAmount);//subtract from account2 balance
		
		//display balances
		System.out.printf("%s balance: $%.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", 
				account2.getName(), account2.getBalance());
	}

}//end of AccountTest class

