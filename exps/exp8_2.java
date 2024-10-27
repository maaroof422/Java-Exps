// Aim: interface Matrix
//      	{
//      	Final static int M=5, N=5;
//      	Void readMatrix();
//      	Void displayMatrix();
//      	Void addMatrix();
//      	}
//      	Implement above interface using suitable java class program and also develop the main program.
// Name: Khan Maaroof
// UIN: 231P059
package javaproject;
import java.util.Scanner;
interface Matrix {
    	final static int M = 5, N = 5;
    	void readMatrix();
    	void displayMatrix();
    	void addMatrix(MatrixImplementation m2);
}	
class MatrixImplementation implements Matrix {
int[][] matrix = new int[M][N];
    	public void readMatrix(); {
        		Scanner sc = new Scanner(System.in);
        		System.out.println("Enter elements for a " + M + "x" + N + " matrix:");
        		for (int i = 0; i < M; i++) {
            			for (int j = 0; j < N; j++) {
                				matrix[i][j] = sc.nextInt();
            			}
        		}
}
public void displayMatrix() {
System.out.println("Matrix:");
        		for (int i = 0; i < M; i++) {
            			for (int j = 0; j < N; j++) {
                				System.out.print(matrix[i][j] + " ");
            			}
            			System.out.println();
        		}
}	
public void addMatrix(MatrixImplementation m2) {
int[][] result = new int[M][N];
        		for (int i = 0; i < M; i++) {
            			for (int j = 0; j < N; j++) {
                				result[i][j] = this.matrix[i][j] + m2.matrix[i][j];
}
        		}
        		System.out.println("Sum of matrices:");
        		for (int i = 0; i < M; i++) {
            			for (int j = 0; j < N; j++) {
                				System.out.print(result[i][j] + " ");
            			}
            			System.out.println();
        		}		
    	}	
}
public class javaproject {
public static void main(String[] args) {
       		MatrixImplementation m1 = new MatrixImplementation();
        		MatrixImplementation m2 = new MatrixImplementation();
        		System.out.println("Matrix 1:");
        		m1.readMatrix();
        		System.out.println("Matrix 2:");
        		m2.readMatrix();
       		System.out.println("Matrix 1:");
        		m1.displayMatrix();
        		System.out.println("Matrix 2:");
       		m2.displayMatrix();
        		m1.addMatrix(m2);
        		System.out.println("Name: Khan Maaroof \nUIN:231P059 \nBranch:Comps A");	

    	}
}
