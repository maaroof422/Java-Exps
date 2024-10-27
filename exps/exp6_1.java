// Aim: Write a program to implement a Vector that accepts five items from the command line and store them
//        in a Vector and display the objects stored in a Vector.
// Name: Khan Maaroof Nahid
// UIN: 231P059
package javaproject;
import java.util.*;
public class javaproject {
	public static void main(String[] args) {
		Vector list = new Vector();
		int len = args.length;
		for(int i = 0; i < len; i++)
			list.addElement(args[i]);
		int size = list.size();
		String str[] = new String[size];
		list.copyInto(str);
		for(int i = 0; i < size; i++)
			System.out.println("Element of Vector at position " + i + " is " + str[i]);
		System.out.println("Name: Khan Maaroof \nUIN:231P059 \nBranch:Comps A");
	}
}
