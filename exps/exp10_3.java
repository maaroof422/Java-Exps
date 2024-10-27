// Aim: Write a program to perform division of two numbers accepted from user. Handle the
//      NumberFormatException and also handle the divide by exception using nested try catch block.
// Name: Khan Maaroof Nahid
// UIN: 231P059
import java.util.Scanner;
public class NestedTryCatch {
    	public static void main(String args[]) {
double numerator, denominator, result;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number (numerator):");
try {
numerator = sc.nextDouble();
System.out.println("Enter the second number (denominator):");
try {
denominator = sc.nextDouble();
try {
result = numerator / denominator;
System.out.println("Result: " + result);
System.out.println("Name: Maaroof Khan \nUIN:231P059 \nBranch:Comps A");
} catch (ArithmeticException ae) {
System.out.println("Error: Division by zero is not allowed.");
}
} catch (Exception e) {
System.out.println("Error: Invalid input for denominator. Please enter a valid number.");
}
} catch (Exception e) {
System.out.println("Error: Invalid input for numerator. Please enter a valid number.");
} finally {
sc.close();
}
    	}
}

