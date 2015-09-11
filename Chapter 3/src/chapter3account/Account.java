package chapter3account;

/*3.11. - Modified Account Class
Modify class Account (Fig 3.8) to provide a method called with-draw that withdraws money from an Account.
Ensure that the withdrawal amount does not exceed the Account's balance. If it does, the balance should 
be left unchanged and the method should print a message indicating "Withdrawal amount exceeded account balance."
Modify class AccountTest (Fig 3.9) to test method withdraw.*/

public class Account {

		private String name;
		private double balance;
		
		public Account(String name, double balance)
		{
			this.name = name;
			
			//validate that the balance is greater than 0.0; if it's not,
			//instance variable balance keeps its default initial value of 0.0
			if (balance >0.0) //if the balance is valid
				this.balance = balance;//assign it to the instance variable balance
			
		}
		
		//method that deposits (adds) only a valid amount to the balance
		public void deposit (double depositAmount)
		{
			if (depositAmount > 0.0)//if the depositAmount is valid
				balance = balance+ depositAmount;//add it to the balance
		}
		
		//method returns the account balance
		public double getBalance()
		{
			return balance;
		}
		
		//method that sets the name
		public void setName(String name)
		{
			this.name = name;
		}
		
		//method that returns the name
		public String getName()
		{
			return name;//give value of name back to caller 
		}
		
		//method that withdraws (subtracts) only a valid amount from balance
		public void withdraw(double withdrawAmount)
		{
			if(withdrawAmount <= balance)//if the withdrawAmount is valid
				balance -= withdrawAmount;//subtract it from balance
			else//if the withdrawAmount is not enough print statement stating it is not valid
				System.out.println("Withdrawal amount exceeded account balance");
		}
		
}//end class Account
