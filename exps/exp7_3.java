// Aim: Write a program to calculate volume of sphere using multilevel inheritance demonstrating method
//      	overriding. The base class method will accept the radius from user. A class will be derived from
//      	above mentioned class that will have a method to find area of circle and another class derived
//      	from this will have methods to calculate and display the volume of sphere
// Name: Khan Maaroof
// UIN: 231P059
package javaproject;
import java.util.Scanner;

class BaseClass {
    	protected double radius;

    	public void acceptData() {
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter the radius: ");
        	radius = scanner.nextDouble();
        	System.out.println("Radius accepted in BaseClass: " + radius);
    	}
}
class Circle extends BaseClass {
protected double area;
    	public void acceptData() {
        		super.acceptData();  
        		System.out.println("Data accepted and passed to Circle class.");
    	}
  	public void calculateArea() {
        		area = Math.PI * radius * radius;
    	}
    	public void displayArea() {
System.out.println("Area of the circle: " + area);
    	}
}
class Sphere extends Circle {
private double volume;
public void acceptData() {
        		super.acceptData();  
System.out.println("Data accepted and passed to Sphere class.");
}
public void calculateVolume() {
        		volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
}    
public void displayVolume() {
        		System.out.println("Volume of the sphere: " + volume);
}
}
public class javaproject {
public static void main(String[] args) {
Sphere sphere = new Sphere();
sphere.acceptData();
sphere.calculateArea();
        		sphere.displayArea();
sphere.calculateVolume();
        		sphere.displayVolume();
        		System.out.println("Name: Khan Maaroof \nUIN:231P059 \nBranch:Comps A");	

    	}
}
