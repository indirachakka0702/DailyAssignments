package ImplementInterface;

public class Account
{
  double Balance = 0;
  public static void main(String[] args) 
  {
	  SavingsAccount SA = new SavingsAccount(10000);
	  SA.WithdrawAmount(500);
	  SA.MakePayment(100);
	  CurrentAccount CA = new CurrentAccount(1000);
	  CA.WithdrawAmount(100);
	  CA.MakePayment(50);
	  
  }

}
class SavingsAccount extends Account implements Entry 
{
	SavingsAccount(double amont)
	{
		System.out.println("Your Savings Account balance is= "+amont);
	}


  public void WithdrawAmount(double Balance)
   {
	  
	 System.out.println("Savings Account Withdraw Amount = "+Balance);
	 
   }

  public void MakePayment(double Balance)
   {
	  System.out.println("Savings Account Make payment = "+ Balance);
	  
    }
   
}
class CurrentAccount extends Account implements Entry
{
	CurrentAccount(double amount)
	{
		System.out.println("Your Current account balance is = "+amount);
	}
	public void WithdrawAmount(double Balance)
	{
		 double  ExtraCharges = Balance*0.1;
		System.out.println("CurrentAccount Withdrawl Amount = "+(Balance-ExtraCharges));
	}
	public void MakePayment(double Balance)
	{
		System.out.println("CurrentAccount Make payment = "+ Balance);
	}
}


	
