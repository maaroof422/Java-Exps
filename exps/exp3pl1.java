// Khan Maaroof Nahid
// 14 B1 Comps SE A div
// 231P059

package b3_SKL_Java;
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Euclid obj1 = new Euclid();
        int a,b,g;
        Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter the numbers for GCD: ");
		a = sc.nextInt();
		b = sc.nextInt();
        
        // Function call
      g = obj1.gcd(a, b);
      System.out.println("GCD(" + a + " , " + b + ") = " + g);

	}


	}


class Euclid
{
	public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }
}