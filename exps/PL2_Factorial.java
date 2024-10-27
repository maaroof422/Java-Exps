// Name: Khan Maaroof Nahid
// UIN: 231P059	

// Create a package named 'mathutils'
package mathutils;

public class PL2_Factorial {  // Rename the class to match the filename
    
    // Method to compute factorial of a number
    public int computeFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
