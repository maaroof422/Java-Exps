/* 
EXP9 : Calculate area of Rectangle and Circle using abstract class 
NAME : Khan Maaroof Nahid
UIN : 231P059
*/ 
abstract class Shape { 
 abstract double area(); 
} 
class Rectangle extends Shape { 
 double length, width; 
 Rectangle(double length, double width) { 
 this.length = length; 
 this.width = width; 
 } 
 @Override 
 double area() { 
 return length * width; 
 } 
} 
class Square extends Shape { 
 double side; 
 Square(double side) { 
 this.side = side; 
 } 
 @Override 
 double area() { 
 return side * side; 
 } 
} 
public class Exp9PostLab2 { 
 public static void main(String[] args) { 
 Rectangle rectangle = new Rectangle(5, 3); 
 Square square = new Square(4); 
 
 System.out.println("Area of Rectangle: " + rectangle.area()); 
 System.out.println("Area of Square: " + square.area()); 
 } 
}