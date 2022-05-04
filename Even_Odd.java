package Assignment_2;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
	//5.Java Program to Check Whether Number is Even or Odd
		System.out.println("Enter numbers : ");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is even");
			
		}else {
			System.out.println("Number is odd");
		}

	}

}
