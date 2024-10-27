// Aim: Write a program that accepts a shopping list of items and perform the following operations: Add
// 		an item at specified location, delete an item in the list, and print the content of vector.
// Name: Khan Maaroof
// UIN: 231P059

package javaproject;

import java.util.Scanner;
import java.util.Vector;

public class javaproject {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String obj;
		Vector list = new Vector();
		list.addElement("milk");
		list.addElement("egg");	
		list.addElement("butter");	
		list.addElement("curd");	
		System.out.print("Enter item: ");
		obj=sc.nextLine();
		System.out.println();
		list.insertElementAt(obj,1);
		System.out.println("The list :-"+list);
		list.remove(4);
		System.out.println("The list after removing item:-"+list);
		System.out.println("Name: Khan Maaroof \nUIN:231P059 \nBranch:Comps A");	
	}
}
