// Khan Maaroof Nahid
// 14 B1 Comps SE A div
// 231P059

package lesson1;
import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Select an operation:");
	        System.out.println("+  : Addition");
	        System.out.println("-  : Subtraction");
	        System.out.println("*  : Multiplication");
	        System.out.println("/  : Division");
	        System.out.println("%  : Modulus");
	        System.out.println("Enter your choice (+, -, *, /, %, or q to quit):");

	        char choice = sc.next().charAt(0);
	        
	        double num1, num2, result;

	        switch (choice) {
	            case '+':
	                System.out.print("Enter first number: ");
	                num1 = sc.nextDouble();
	                System.out.print("Enter second number: ");
	                num2 = sc.nextDouble();
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	                
	            case '-':
	                System.out.print("Enter first number: ");
	                num1 = sc.nextDouble();
	                System.out.print("Enter second number: ");
	                num2 = sc.nextDouble();
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	                
	            case '*':
	                System.out.print("Enter first number: ");
	                num1 = sc.nextDouble();
	                System.out.print("Enter second number: ");
	                num2 = sc.nextDouble();
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;
	                
	            case '/':
	                System.out.print("Enter first number: ");
	                num1 = sc.nextDouble();
	                System.out.print("Enter second number: ");
	                num2 = sc.nextDouble();
	                // Check for division by zero
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	                
	            case '%':
	                System.out.print("Enter first number: ");
	                num1 = sc.nextDouble();
	                System.out.print("Enter second number: ");
	                num2 = sc.nextDouble();
	                result = num1 % num2;
	                System.out.println("Result: " + result);
	                break;
	                
	            case 'q':
	            case 'Q':
	                System.out.println("Quitting the program.");
	                break;
	                
	            default:
	                System.out.println("Invalid choice! Please enter one of +, -, *, /, %, or q.");
	                break;
	        }
	        sc.close();
	}
}
