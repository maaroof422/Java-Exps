// Name: Khan Maaroof Nahid
// UIN: 231P059	

// Create a package named 'mainpackage'
package mainpackage;

// Import the utils package
import utils.LargestNumber;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // Creating Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Create an instance of LargestNumber from utils package
        LargestNumber largestNumber = new LargestNumber();
        
        // Find and display the largest number
        int largest = largestNumber.findLargest(num1, num2);
        System.out.println("The largest number is: " + largest);
    }
}
