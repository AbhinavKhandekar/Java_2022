package Assignment_2;

public class Reverse_Number_Using_array {

	public static void main(String[] args) {
		//16.Java Program to Reverse a Number
		int a[]= {1,2,3,4,5};
		System.out.println("Orignal array");
		for(int i:a) {
			System.out.print(i);
			
		}
		System.out.println();
		
		//Reverse Array 
		System.out.println("Revers array ");
		//int i=0;
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+ " ");
		}

	}

	}


