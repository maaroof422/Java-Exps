// Aim: Write a program to print /*/*/*/*/* using two child thread.
// Name: Khan Maaroof Nahid
// UIN: 231P059
class StarThread extends Thread {
public void run() {
for (int i = 0; i < 5; i++) {
System.out.print("*");
try {
Thread.sleep(100); 
} catch (InterruptedException e) { }
}
}
}
class SlashThread extends Thread {
    	public void run() {
for (int i = 0; i < 5; i++) {
System.out.print("/");
try {
Thread.sleep(100); 
} catch (InterruptedException e) { }
}
}
}
public class Threading1 {
public static void main(String[] args) {
StarThread starThread = new StarThread();
SlashThread slashThread = new SlashThread();
starThread.start();
slashThread.start();
try {
starThread.join();
slashThread.join();
System.out.println("Name: Maaroof Khan \nUIN:231P059 \nBranch:Comps A");
} catch (InterruptedException e) { }
System.out.println(); 
}
}
