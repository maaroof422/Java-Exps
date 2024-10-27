// Aim: Write a Program to implement user defined Exception in java.
// Name: Khan Maaroof Nahid
// UIN: 231P059
import java.util.*;
public class Month {
public static void main(String args[]) {
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the month number:");
n = sc.nextInt();
try {
if (n > 12 || n < 1) {
throw new ArithmeticException();
}
System.out.println("Month number entered is=" + n);
System.out.println("Name: Maaroof Khan \nUIN:231P059 \nBranch:Comps A");
} catch (ArithmeticException ae) {
System.out.println("Invalid Number!");
}
}
}
