package SKL_JAVA_B1;
/*
 * Name: Maaroof Khan
 * Class: FE
 * Div: A
 * Roll No: 14
 * Uin: 231P059
 * */
import java.util.*;
public class string_methods {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		char name[]= {'M','a','a','r','o','o','f'};
		String str1=new String(name);//Method 1
		String str2=new String();
		System.out.println("Enter a String:");
		str2=sc.nextLine();
		String str3=str1.concat(str2);//method 2
		String str4=str1.toLowerCase();//method 3
		String str5=str2.toUpperCase();//method 4
		int len =str3.length();//method 5
		
		do { 
		System.out.println("----Menu----\n");
		
		System.out.println("1.Convert Array to String\n2.Combine Two string\n3.Convert 1st String to lower case\n4.Convert 2nd String to Upper Case\n5.Print Length of combined String 1 & String 2 \n6.Exit");
		System.out.println("Enter a Choice:");
		choice=sc.nextInt();

		switch(choice) {
		case 1:{
			System.out.println(str1+"\n");
			break;
		}
		case 2:{
			System.out.println(str3+"\n");
			break;
		}
		case 3:{
			System.out.println(str4+"\n");
			break;
		}
		case 4:{
			System.out.println(str5+"\n");
			break;
		}
		case 5:{
			System.out.println("Length of the Combined String is:"+len);
			break;
		}
		default:{
			System.out.println("Invalid Choice");
		}
		}
		}while(choice!=6);
		System.out.println("Thankyou!");
	
		
	

		

		

		
		

	}

}
