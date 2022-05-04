package Assignment_2;

import java.util.Scanner;

public class Sum_of_Natural_number {

	public static void main(String[] args) {
	//8.Java Program to Calculate Sum of Natural Numbers
		
		/*int a=10,sum=0;
		
		for(int i=1;i<=a;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of 10 natural number : "+sum);*/
		
		//Taking input from user
		System.out.println("Enter a numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		
		for(int i=0;i<=a;i++) {
			sum=sum+i;
		}
        System.out.println(sum);
	}

}
