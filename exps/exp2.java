// Khan Maaroof Nahid
// 14 B1 Comps SE A div
// 231P059

package lesson1;

public class Pattern {

	public static void main(String[] args) {

		stop: { 
			nextRow: 
			for(int row=1;row<=7;row++) 
			{ 
				if (row==6) 
				break stop; 
			System.out.println(); 
			for(int column=1;column<=10;column++) 
			{ 
			if(column>row) 
			continue nextRow; 
			System.out.print(" * ");
				} 
			} 
		} 
		System.out.print("\n Name : Khan Maaroof Nahid \n "
				+ "Roll no: 14 \n " + "UIN : 231P059 \n " + "BATCH : B1 COMPS");
	} 
} 

