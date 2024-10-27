// Aim:  Write a program to add integer number and string using method overloading.
// Name: Maaroof Khan
// UIN: 231P059

package skl_op_package;
public class StringInteger {
	public static void main(String[] args) {
		StrInt obj = new StrInt();
		int sum = obj.add(5, 10);
		System.out.println("Sum of integers: " + sum); 
		String concatenatedString = obj.add("Hello ", "World");
		System.out.println("Concatenated String: " + concatenatedString);
	}
}

class StrInt
{
	public int add(int a, int b)
	{
		return a + b;
	}
	
		
	public String add(String a, String b) 
	{
		return a + b;
	}
}