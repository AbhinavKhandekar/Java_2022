package Assignment_2;

import java.util.Scanner;

public class factorial_number {

	public static void main(String[] args) {
	//9.Java Program to Find Factorial
		System.out.println("Enter a number : ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=a;i++) {
        fact=fact*i;
	}
		System.out.println("Factorila of : "+a+" is "+fact);

}
}
