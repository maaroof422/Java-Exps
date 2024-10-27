// Aim: Write a program to print alphabets and numbers using two threads.
// Name: Khan Maaroof Nahid
// UIN: 231P059
class AlphabetThread extends Thread {
public void run() {
for (char c = 'A'; c <= 'Z'; c++) {
System.out.print(c + " ");
try {
Thread.sleep(100); 
} catch (InterruptedException e) { }
}
}
}
class NumberThread extends Thread {
    	public void run() {
for (int i = 0; i <= 9; i++) {
System.out.print(i + " ");
try {
Thread.sleep(100); 
} catch (InterruptedException e) { }
        		}
}
}
public class Threading2 {
public static void main(String[] args) {
AlphabetThread alphabetThread = new AlphabetThread();
NumberThread numberThread = new NumberThread();
alphabetThread.start();
numberThread.start();
try {
alphabetThread.join();
numberThread.join();
System.out.println("Name: Maaroof Khan \nUIN:231P059 \nBranch:Comps A");
} catch (InterruptedException e) { }
System.out.println();
}
}
