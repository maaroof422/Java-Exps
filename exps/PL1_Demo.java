// Name: Khan Maaroof Nahid
// UIN: 231P059	

// Create a package named 'mainpackage'
package mainpackage;

// Import the utils package
import utils.Adder;

import java.util.Scanner;

public class PL1_Demo {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Create an instance of Adder class from the utils package
        Adder adder = new Adder();
        
        // Call the add method to add the two numbers
        int sum = adder.add(num1, num2);
        
        // Display the result
        System.out.println("The sum of the two numbers is: " + sum);
    }
}
