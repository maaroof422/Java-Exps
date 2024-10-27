// Aim: Write a program to create vector objects with student name. Program should perform following
//		operations based on choice:
// 		(i) Add student name
// 		(ii) Remove student name
// Name: Khan Maaroof Nahid
// UIN: 231P059
package javaproject;
import java.util.*;
public class javaproject {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Vector list = new Vector();
                		while(true)
                		{
                        		System.out.println("MAIN MENU");
                        		System.out.println("Perform choices on a vector based on the options below:\n");
                        		System.out.println("1. Add a student's name");
                        		System.out.println("2. Remove a student's name");
                        		System.out.println("3. Display the vector");
                        		System.out.println("4. Exit");
                        		System.out.print("Enter your choice (1-4): ");
                        		int ch = sc.nextInt();
                        		String name;
                        		switch(ch)
                        		{
                                			case 1:
                                       			 System.out.print("\nEnter the name of the student: ");
                                       			name = sc.next();
                                        			list.addElement(name);
                                        			System.out.println("Name successfully added.");
                                        			break;
case 2:
                                        			System.out.print("\nEnter the name of the student to be removed: ");
                                        			name = sc.next();
                                        			list.remove(name);
                                        			System.out.println("Removed a student from the vector.");
                                        			break;
                                			case 3:
                                        			System.out.println("\nDisplaying Vector:\n" + list);
                                        			break;
                                			case 4:
                                        			System.out.println("Name: Maaroof Khan \nUIN:231P059 \nBranch:Comps A");	
                                        			sc.close();
                                        			System.exit(0);
                                			default:
                                        			System.out.println("Invalid Choice.");
                        		}
                		}
}	
}
