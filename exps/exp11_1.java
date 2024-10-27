// Aim: Write a program to implement Multithreading in java
// Name: Khan Maaroof Nahid
// UIN: 231P059
public class Multithreading extends Thread {
public static void main(String args[]) {
Multithreading ex = new Multithreading();
ex.create();
System.out.println("this is the main thread!");
}
public void create() {
Thread t = new Thread(this);
t.start();
    	}
public void run() {
while (true) {
try {
System.out.println("this is the child thread!");
Thread.sleep(500);
} catch (InterruptedException e) { }
}
}
}
