// Aim: Write a program to perform division of two numbers accepted from user. Handle the
//      IOException, NumberFormatException and also handle the divide by exception using multiple try
//      catch block.
// Name: Khan Maaroof Nahid
// UIN: 231P059
import java.util.Scanner;
public class MultipleTryCatch {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double num1 = 0;
double num2 = 0;
while (true) {
try {
System.out.print("Enter the first number: ");
num1 = Double.parseDouble(scanner.nextLine());
	break;
	} catch (NumberFormatException e) {
	System.out.println("Invalid input! Please enter a valid number.");
}	
}
while (true) {
	try {
	System.out.print("Enter the second number: ");
	num2 = Double.parseDouble(scanner.nextLine());
	break;
	} catch (NumberFormatException e) {
System.out.println("Invalid input! Please enter a valid number.");
}
	}
	try {
	double result = num1 / num2;
System.out.println("The result of " + num1 + " divided by " + num2 + " is: " + result);
System.out.println("Name: Maaroof Khan \nUIN:231P059 \nBranch:Comps A");
} catch (ArithmeticException e) {
System.out.println("Error! Division by zero is not allowed.");
}
scanner.close();
}
}
