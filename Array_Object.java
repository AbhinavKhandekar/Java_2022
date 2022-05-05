package Assignment_3;

public class Array_Object {

	public static void main(String[] args) {
		// program to print the name, salary and date of joining of 10 employees in a company. 
		//Use array of objects.
		
		Employess[] arr;
		
		arr=new Employess[10];
		
		arr[0]= new Employess("Abhinav",25000,"26feb2021");
		arr[1]= new Employess("Akash",27000,"25jan2022");
		arr[2]= new Employess("sid",28000,"25jan2020");
		arr[3]= new Employess("Soma",23000,"25mar2022");
		arr[4]= new Employess("Sam",22000,"12jan2022");
		arr[5]= new Employess("Max",29000,"25april2022");
		arr[6]= new Employess("john",32000,"25jan2019");
		arr[7]= new Employess("Guru",19000,"25aug2021");
		arr[8]= new Employess("Rohit",22000,"20jan2022");
		arr[9]= new Employess("Rocky",30000,"7jan2022");
		
		
		arr[0].display();
		arr[1].display();
		arr[2].display();
		arr[3].display();
		arr[4].display();
		arr[5].display();
		arr[6].display();
		arr[7].display();
		arr[8].display();
		arr[9].display();
		
	}

}
class Employess {
	public int salary;
	public String name;
	public String date;
	 
	Employess(String name,int salary, String date){
		this.name=name;
		this.salary=salary;
		this.date=date;
	}
	public void display() {
		
		
		System.out.println("Name of Employess: "+name+" "+"--Salary of Employess: "+salary+" "+"--Joing date of Employess: "+date);
	}
	
	
	
}