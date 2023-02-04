package demo;

public class CheckingAccount 
{
	private double balance;
	 private int number;
	 
	 public CheckingAccount(int number)
	 {
	 this.number = number;
	 }
	 
	 public void deposit(double amount)
	 {
	 balance += amount;
	 }
	 
	 public void withdraw(double amount) throws InsufficientFundsException
	 {
	 if(amount <= balance)
	 {
	 balance -= amount;
	 }
	 else
	 {
	 double needs = amount - balance;
	 throw new InsufficientFundsException(needs);
	 }
	 }
	 
	 public double getBalance()
	 {
	 return balance;
	 }
	 Java
	288
	 public int getNumber()
	 {
	 return number;
	 }
	}

}
