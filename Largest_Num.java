package Assignment_2;

import java.util.Scanner;

public class Largest_Num {

	public static void main(String[] args) {
	//7.Java Program to Find Largest Number Among Three Numbers
		System.out.println("Enter 3 numbers : ");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println(a+" is largest number");
		}else if(b>=a && b>=c) {
			System.out.println(b+" is largest number");
		}else {
			System.out.println(c+" is largest number");
		}

	}

}
