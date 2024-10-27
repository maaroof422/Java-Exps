// Aim:  Write a program to find area of Rectangle, Triangle and circle using constructor overloading.
// Name: Maaroof Khan
// UIN: 231P059

package skl_op_package;
import java.util.*;

public class ConstructorAreaRTC {

	public static void main(String[] args) {
		
		double r,l,b,h,ba;
		Scanner sc = new Scanner(System.in);
		System.out.println("For Area of Circle : ");
		System.out.println("Enter the Radius : ");
		r=sc.nextDouble();

		System.out.println("For Area of Rectangle : ");
		System.out.println("Enter the Length and Breadth : ");
		l=sc.nextDouble();
		b=sc.nextDouble();
		
		System.out.println("For Area of Triangle : ");
		System.out.println("Enter the Base and Height : ");
		ba=sc.nextFloat();
		h=sc.nextFloat();
		
		areaa a1 = new areaa(r);
		areaa b1 = new areaa(l,b);
		areaa c1 = new areaa(ba,h);
	}
}

class areaa
{
	double r,l,b,h,ba;
	
	areaa(double r)
	{
		System.out.println("Area of the Circle is = "+(3.14*r*r));
	}
	
	areaa(double l,double b)
	{
		System.out.println("Area of the Rectangle : "+(l*b));
	}
	
	areaa(float ba,float h)
	{
		System.out.println("Area of the triangle : "+(0.5*b*h));
	}
	
}