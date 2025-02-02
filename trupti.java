import java.util.*;

class trupti
{
	Scanner sc=new Scanner(System.in);
	String name;
	int salary;
	int TDS;
	
	
	
	trupti()
	{
		System.out.println("Your Name");
		this.name=sc.nextLine();
		System.out.println(" ");
		System.out.println("print Salary");
		this.salary=sc.nextInt();
		System.out.println(" ");
		System.out.println("print TDS");
		this.TDS=sc.nextInt();
		System.out.println(" ");
		
		
		System.out.println("your name:- "+this.name+ "Your Totale salary is "+(this.salary+this.TDS));
	}
	
}


class second
{
	public static void main(String args[])
	{
		trupti t1=new trupti();
		trupti t2=new trupti();
		trupti t3=new trupti();
		trupti t4=new trupti();
		
		System.out.println("");
	}
}