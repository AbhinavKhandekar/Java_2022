package Assignment_2;

import java.util.Scanner;

public class Quotient_Remainder {
	
	//2.Java Program to Find Quotient and Remainder

	public static void main(String[] args) {
	System.out.println("Enter two values : ");
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	
	int quotient=num1/num2;
	int Reminder=num1%num2;
	
	System.out.println("Quotient when " + num1 + "/" + num2 + " is: "+ quotient);  
	System.out.println("Remainder when " + num1 + " is divided by "  + num2 + " is: " + Reminder);  
	}

}
