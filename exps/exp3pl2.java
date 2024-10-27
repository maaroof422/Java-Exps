// Khan Maaroof Nahid
// 14 B1 Comps SE A div
// 231P059

package lesson1;
import java.util.Scanner;

public class Exp3pl {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float radius;
		float area;
		
		circle A = new circle();
		
		radius = A.Accept_radius();
		area = A.CalArea(radius);
		A.DispArea(area);
		
		sc.close();
	}
}

class circle
{	Scanner sc = new Scanner (System.in);
	float radius;
	float area;
float Accept_radius()
{
	System.out.println("Enter radius: ");
	return sc.nextFloat();
	}

float CalArea(float a)
{
	return (float) (3.141*a*a);
}
void DispArea(float b)
{
	System.out.println("The area is: " + b);
}
}