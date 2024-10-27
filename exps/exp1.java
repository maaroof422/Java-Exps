// Khan Maaroof Nahid
// 14 B1 Comps SE A div
// 231P059

package lesson1;
import java.io.*;
import java.util.Scanner;

public class Menu
{
public static void main(String args[]) throws IOException
{
	int x,y,choice;
	DataInputStream in = new DataInputStream(System.in);
	Scanner sc =new Scanner(System.in);

	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("\n\t\tTHIS PROGRAM PERFORMS MENU DRIVEN ARITHMATIC OPERATION: ");
	System.out.println("\t\tMENU");

	System.out.println("\t 1. Addition ");
	System.out.println("\t 2. Subtraction ");
	System.out.println("\t 3. Division ");
	System.out.println("\t 4. Multiplication ");
	System.out.println("\t 5. Modulus ");
	System.out.println("\t 6. Exit ");
	do {
	System.out.println("Enter your choice: ");
	choice=Integer.parseInt(in.readLine());
	
	switch (choice)
	
	{ case 1: System.out.print("Input through DataInputStream :\n");
	System.out.print("Enter First Number: ");
	x=Integer.parseInt(in.readLine());
	System.out.print("Enter Second Number: ");
	y =Integer.parseInt(in.readLine());
	System.out.println("Addition of "+ x +" and "+ y +" : "+(x + y));
	
	break ;
	case 2 : System.out.print("Input through Scanner :\n");
	System.out.print("Enter First Number: ");
	x =sc.nextInt();
			System.out.print("Enter Second Number: ");
			y =sc.nextInt();
			
			System.out.println("Subtraction of "+x+" and "+y+" : "+(x-y));
			
			break ;
			case 3 : System.out.print("Input through BufferedReader :\n");
			System.out.print("Enter First Number: ");
			
			x=Integer.parseInt(br.readLine());
			System.out.print("Enter Second Number: ");
			y=Integer.parseInt(br.readLine());
			
			System.out.println("Division of "+ x +" and "+ y +" : "+( (float)x / (float)y ));
			
			break ;

		case 4 :System.out.print("Input through Scanner :\n");
		System.out.print("Enter First Number: ");
		x =sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		y =sc.nextInt();
		System.out.println("Multiplication of "+ x +" and "+ y +" : "+(x * y));

		break ;

		case 5 : System.out.print("Input through Scanner :\n");
		System.out.print("Enter First Number :");
		x =sc.nextInt();
		System.out.print("Enter Second Number :");
	y =sc.nextInt();
	System.out.println("Modulus of "+ x +" and "+ y +" : "+(x % y));
	break ;

	case 6 : System.out.println(" Thank You");
	System.exit(0);

	default :System.out.println("Wrong choice !!");

	}
	}while (choice!=6);
	sc.close();
	}
}