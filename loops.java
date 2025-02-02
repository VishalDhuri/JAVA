import java.util.*;

/*class whileloops
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}
	}
}



class whileloops
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int i=5;
		while(i>0)
		{
			System.out.println(i);
			i--;
		}
	}
}



class whileloops
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		
		int n=sc.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(n*i);
			i++;
		}
	}
}

class whileloops
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			System.out.println(i);
			i++;
		}
	}
}

class whileloops
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		int count=0;
		
		while(i<=10)
		{
			if(i%2==0)
			{
				count++;
			}
			i++;
		}
		System.out.println("count"+count);
	}
}
*/
class whileloops
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		int count=0;
		while(i<=100)
		{
			if(i%7==0 && i%2==0)
			{
				count++;
			}
			i++;
		}
		System.out.println("Number "+count);
	}
}

