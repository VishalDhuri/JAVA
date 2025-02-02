import java.util.*;
/*
class methods
{
	public static void printHello(String name,int age)
	{
		System.out.println("Hello "+name+" Your Age is "+age);
	}
	
	public static void main(String args[])
	{
		printHello("Rohit",37);
		printHello("Shubman",26);
		printHello("Cheteshwar",38);
		printHello("Virat",37);
	}
}



class methods
{
	public static void printHello(String name,int age)
	{
		System.out.println("Hello "+name+" Your Age is "+age);//because of void we need to write a SOP 
	}
	
	public static int add(int a,int b)
	{
		return a+b; //because of int we need to return the value
	}
	
	public static void main(String args[])
	{
		int c=add(25,96);
		System.out.println(c);//first method to get Answer
		System.out.println(add(25,96));//second method to get answer
	}
}



class methods
{
	public static void printHello(String name,int age)
	{
		System.out.println("Hello "+name+" Your Age is "+age);
	}
	
	public static int add(int a,int b)
	{
		return a+b; 
	}
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(add(a,b));
	}
}

*/



class methods
{
	
	public static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print("Your sub is ");
		sub(a,b);
	}
}