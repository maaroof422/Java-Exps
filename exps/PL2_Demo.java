// Name: Khan Maaroof Nahid
// UIN: 231P059	

// Create a package named 'mainpackage'
package mainpackage;

// Import the mathutils package
import mathutils.Factorial;

import java.util.Scanner;

public class PL2_Demo {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number to compute its factorial: ");
        int num = scanner.nextInt();
        
        // Create an instance of the Factorial class from the mathutils package
        Factorial factorial = new Factorial();
        
        // Call the computeFactorial method to calculate the factorial
        int result = factorial.computeFactorial(num);
        
        // Display the result
        System.out.println("The factorial of " + num + " is: " + result);
    }
}
