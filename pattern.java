import java.util.*;
/*
class pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=n;j++)			
			{
				System.out.print("*");
				
			}
		System.out.println();
		}
	}
}


class pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=5;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)			
			{
				System.out.print("*");
				
			}
		System.out.println();
		}
	}
}




class pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=5;
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)			
			{
				System.out.print("*");
				
			}
		System.out.println();
		}
	}
}






class pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=4;
		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<=n-i;k++)
				System.out.print(" ");
			
			
			for(int j=1;j<=i;j++)			
			{
				System.out.print("* ");
				
			}
		System.out.println(); 
		}
		
		
		for(int i=n-1;i>=1;i--)
		{
			
			for(int k=1;k<=n-i;k++)
				System.out.print(" ");
			
			
			for(int j=1;j<=i;j++)			
			{
				System.out.print("* ");
				
			}
		System.out.println(); 
		}
	}
}




class pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=5;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)			
			{
				if(i%2==0)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(i);
				}
			}
			System.out.println(); 
		}
	}
}
*/


class pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=4;
		for(int i=1;i<=n;i++)
		{
		
			for(int j=1;j<=i;j++)			
			{
				if((i+j)%2==0)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
			}
			System.out.println(); 
		}
	}
}























