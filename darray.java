import java.util.*;
/*
class darray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[2][2];
		
		a[0][0]=21;
		a[0][1]=22;
		a[1][0]=23;
		a[1][1]=24;
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
	}
}


class darray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[2][2];
		a[0][0]=21;
		a[0][1]=22;
		a[1][0]=23;
		a[1][1]=24;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("["+i+"]["+j+"]");
				System.out.println(a[i][j]);
			}
		}
	}
}



class darray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[2][2];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("["+i+"]["+j+"]");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("");//for some space i between.
		System.out.println("matrix");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}



class darray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("["+i+"]["+j+"]");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("");//for some space in between.
		System.out.println("matrix");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
*/


class darray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("["+i+"]["+j+"]");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("");//for some space in between.
		System.out.println("Enter Index");
		
		int i1=sc.nextInt();
		int i2=sc.nextInt();
		
		System.out.println(a[i1][i2]);
	}
}



