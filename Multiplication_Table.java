package Assignment_2;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
	//12.Java Program to Generate Multiplication Table
		System.out.println("Enter a nummber");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Multiplication table is : ");
		for(int i=1;i<=10;i++) {
		System.out.println(num+" * "+i+" = "+ num*i);
		}

	}

}
