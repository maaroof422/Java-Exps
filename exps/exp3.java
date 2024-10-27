// Khan Maaroof Nahid
// 14 B1 Comps SE A div
// 231P059

package b3_SKL_Java;

import java.util.Scanner;

public class Account {
	
	public static void main(String[] args) {
	
		int acc_no;
		String name;
		float amount;
	
		Scanner sc = new Scanner(System.in);
				
		System.out.println("\n Enter Customer number: ");
		acc_no = sc.nextInt();
		
		System.out.println("\n Enter Customer Name: ");
		name = sc.next();
		
		System.out.println("\nEnter Customer Amount: ");
		amount = sc.nextFloat();
		
		//Creating object of AccountHelp Class
		AccountHelp obj1 = new AccountHelp();
		// calling a method
		obj1.insert(acc_no, name, amount);
		obj1.display();
		obj1.checkBalance();
		
		System.out.println("'\n Enter amount to be deposited: ");
		float dep_amount = sc.nextFloat();
		obj1.deposit(dep_amount);
		obj1.checkBalance();

		System.out.println("'\n Enter amount to be withdrawn: ");
		float wit_amount = sc.nextFloat();
		obj1.withdraw(wit_amount);
		obj1.checkBalance();
		System.out.println("\n THANK YOU ");
		sc.close();
	}	
}

class AccountHelp
{
		int acc_no;
		String name;
		float amount;
		
			}
		
		//Deposit given amount
		void deposit(float amt)
		{
			amount += amt;
			System.out.println(amt + " deposited");
		}
		
		//Withdraw amount
		void withdraw(float amt)
		{
			if(amount<amt)
			{
				System.out.println("Insuffeicient balance");
			}
			else
			{
				amount=amount-amt;
				System.out.println(amt + " withdrawn");
			}
		}
		
		//Display relevant info
		void display()
		{
			System.out.println("Account Number : " + acc_no);
			System.out.println("Customer Name : " + name);
			System.out.println("Customer Amount : " + amount);
		}
		
		//Check remaining balance
		void checkBalance()
		{
			System.out.println("Balance is: " + amount);
		}

}	//insert method
			void insert(int a ,String n, float amt)
		{
			
			acc_no = a;
			name = n;
			amount = amt;
		}
		
		//Deposit given amount
		void deposit(float amt)
		{
			amount += amt;
			System.out.println(amt + " deposited");
		}
		
		//Withdraw amount
		void withdraw(float amt)
		{
			if(amount<amt)
			{
				System.out.println("Insuffeicient balance");
			}
			else
			{
				amount=amount-amt;
				System.out.println(amt + " withdrawn");
			}
		}
		
	//Display relevant info
		void display()
		{
			System.out.println("Account Number : " + acc_no);
			System.out.println("Customer Name : " + name);
			System.out.println("Customer Amount : " + amount);
		}
		
		//Check remaining balance
		void checkBalance()
		{
			System.out.println("Balance is: " + amount);
		}

  }


