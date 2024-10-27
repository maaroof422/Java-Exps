//Aim: Write a program for delete method of StringBuffer class.
//Name: Khan Maaroof 
//UIN: 231P059

package javaproject;
public class javaproject {	
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("Good morning");  
	    	System.out.println("Before :- " + sb);  
	    	sb = sb.delete(4,20);  
	    	System.out.println("After deleting:- " + sb);  
	    	System.out.println("Name: Khan Maaroof \nUIN:231P059 \nBranch:Comps A");	
	
	}
}
