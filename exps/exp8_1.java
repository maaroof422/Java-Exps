// Aim: Write a program to implement  interface demonstrating the concept of  multiple inheritance. 
// Name: Khan Maaroof
// UIN: 231P059
package javaproject;
import java.util.Scanner;
class Student 
{ 
	int rollNumber; 
	void getNumber(int n) 
	{ 
		rollNumber=n; 
	} 
	void printNumber() 
	{ 
		System.out.println("RollNo is " +rollNumber); 
	} 
} 
class Test extends Student 
{ 
	float part1,part2; 
	void getMarks(float a, float b) 
	{ 
		part1=a; 
		part2=b; 
	} 
	void putMarks() 
	{ 
		System.out.println("Marks Part1 "+part1); 
		System.out.println("Marks Part2 "+part2); 
	} 
} 
interface Sports 
{ 
	float sportwt=60.0F; 
	void putwt(); 
} 
class Results extends Test implements Sports 
{ 
	float total; 
	public void putwt() 
	{ 
		System.out.println("Sports Marks "+ sportwt); 
	} 
	void display()
	{ 
		total=part1+part2+sportwt; 
		System.out.println("Total marks of " +rollNumber+" is "+total); 
	} 
} 
public class javaproject 
{ 
	public static void main(String srgs[]) 
	{ 
		int rollnumber;
		float part1,part2;
		Scanner sc = new Scanner(System.in);		
		System.out.print("Enter the Roll Number: ");
		rollnumber = sc.nextInt();
		System.out.print("Enter the Marks 1: ");
		part1 = sc.nextFloat();
		System.out.print("Enter the Marks 2: ");
		part2 = sc.nextFloat();
		Results a = new Results(); 
		a.getNumber(rollnumber); 
		a.printNumber();
		a.getMarks(part1, part2); 
		a.putMarks(); 
		a.putwt(); 
		a.display(); 
		System.out.println("Name: Khan Maaroof \nUIN:231P059 \nBranch:Comps A");	

	} 
}
