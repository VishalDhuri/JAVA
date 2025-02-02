import java.util.*;
import java.util.Scanner;

/*
class conditional //if
{
	
	public static void main (String args[])//comman
	{
		Scanner sc=new Scanner(System.in);
		
		int a=20;
		if (a==2)
		{
			System.out.println("a is equal to Two");
		}
	System.out.println("outside if");
	}
}	

class conditional
{
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("its even number");
		}
		else
		{
			System.out.println("its odd number");
		}
	}
}


class conditional
{
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" is greater");
		}
		else
		{
			System.out.println(b+" is greater");
		}
	}
}

class conditional
{
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		
		if(a%7==0)
		{
			System.out.println("it is multiple of 7");
		}
		else
		{
			System.out.println("it is not multiple of 7");
		}
	}
}

class conditional //if-else
{
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		
		if(a%7==0)
		{
			System.out.println(a+" it is multiple of 7");
			
			if(a%2==0)
			{System.out.println("also its even");}
			else
			{System.out.println("its odd");}
		}
		else
		{
			System.out.println(a+" it is not multiple of 7");
		}
	}
}

class conditional //nested if-else
{
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		
		if(a>b )
		{
			if(a>c)
			{
				System.out.println(a+" is greatest");
			}
			else
			{
				System.out.println(c+" is greatest");
			}
		}
		else
		{
			if (b>c)
			{
				System.out.println(b+" is greatest");
			}
			else
			{
				System.out.println(c+" is greatest");
			}
		}
	}
}

class conditional //nested if-else
{
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number between 1 to 3");
		int a=sc.nextInt();
		
		
		if(a==1)
		{
			System.out.println("Namaste");
		}
		else if(a==2)
		{
			System.out.println("Namaskar");
		}
		else if(a==3)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Invaild Number");
		}
	}
}

class conditional //else if ladder
{
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a+" its greatest");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" its greatest");
		}
		else
		{
			System.out.println(c+" its greatest");
		}
	}
}*/

class conditional
{
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		
		switch(a)
		{
			case 1:
			System.out.println("Marathi");
			break;
			
			case 2:
			System.out.println("Hindi");
			break;
			
			case 3:
			System.out.println("English");
			break;
			
			
			default:
			System.out.println("Invaild");
		}
		
	}
}