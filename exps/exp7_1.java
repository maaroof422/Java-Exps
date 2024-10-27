// Aim: Write a program to implement single and multilevel inheritance using super keyword.
// Name: Khan Maaroof
// UIN: 231P059
package javaproject;
import java.io.*; 
import java.util.Scanner;
class Account 
{ 
	String cust_name; 
	int acc_no; 
	Account(String a, int b) 
	{
		cust_name=a; 		
		acc_no=b; 
	} 
	void display() 
	{ 
		System.out.println ("Customer Name: "+cust_name); 
		System.out.println ("Account No: "+acc_no); 
	} 
} 
class Online extends Account 
{ 
	Online(String a, int b) 
	{ 
		super(a,b); 
	} 
	void display() 
	{ 
		System.out.println ("Customer-Id: "+(cust_name+acc_no%10)); 
		System.out.println ("Customer Password: "+(acc_no/10+8)); 
	} 
} 
class Saving_Acc extends Account 
{ 
	int min_bal,saving_bal; 	
	Saving_Acc(String a, int b, int c, int d) 
	{ 
		super(a,b); 
		min_bal=c; 
		saving_bal=d; 
	} 
	void display() 
	{ 
		super.display(); 
		System.out.println ("Minimum Balance: "+min_bal); 
		System.out.println ("Saving Balance: "+saving_bal); 
	} 
}
class Acct_Details extends Saving_Acc 
{ 
	int deposits, withdrawals; 
	Acct_Details(String a, int b, int c, int d, int e, int f) 
	{ 
		super(a,b,c,d); 
		deposits=e; 
		withdrawals=f; 
	} 
	void display() 
	{ 
		super.display(); 
		System.out.println ("Deposit: "+deposits); 
		System.out.println ("Withdrawals: "+withdrawals); 
	} 
} 
public class javaproject { 
	public static void main(String args[]) { 
		String AccName;
		int AccNo, CID, CP, MB, SB, D, W;
		Scanner sc = new Scanner(System.in);
		System.out.println("ACCOUNT MENU:");
		System.out.print("Enter the name of Account Holder: ");
		AccName = sc.nextLine();		
		System.out.print("Enter the Account Number: ");
		AccNo = sc.nextInt();
		System.out.print("Enter the Mininum Balance: ");
		MB = sc.nextInt();
		System.out.print("Enter the Saving Balance: ");
		SB = sc.nextInt();
		System.out.print("Enter the Deposit Amount: ");
		D = sc.nextInt();
		System.out.print("Enter the Withdrawal Amount: ");
		W = sc.nextInt();
		System.out.println("DETAILS:");		
		Acct_Details A = new Acct_Details(AccName, AccNo,  MB, SB, D, W); 
		Online ol=new Online(AccName, AccNo); 
		A.display(); 
		ol.display();
		System.out.println("Name: Khan Maaroof \nUIN:231P059 \nBranch:Comps A");	
 
	}
}
