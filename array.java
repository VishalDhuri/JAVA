import java.util.*;

/*
class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[4];
		
		a[0]=11;
		a[1]=12;
		a[2]=13;
		a[3]=14;
		
		System.out.println(a[0]); 
		System.out.println(a[1]); 
		System.out.println(a[2]); 
		System.out.println(a[3]); 
	}
}



class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
	
		int a[]=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			System.out.println("Value at "+i+" Index is "+a[i]);
		}
	}
}



class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
	
		int a[]=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter Index");
		int index=sc.nextInt();
		System.out.println("Value at "+index+" Index is "+a[index]);
		
	}
}



class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
	
		int a[]=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter value");
		int value=sc.nextInt();
		for(int i=0;i<size;i++)
			{
				if(value==a[i])
				{
					System.out.println("element in this value is "+i);
				}
			}
	}
}


class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
	
		int a[]=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<size;i++)
			{
				if(a[i]%2==0)
				{
					System.out.println(a[i]+" Its a Even Number");
				}
				else
				{
					System.out.println(a[i]+" Its a Odd number");
				}
			}
	}
}



class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
	
		int a[]=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int evencount=0;
		int oddcount=0;
		
		
		for(int i=0;i<size;i++)
			{
				if(a[i]%2==0)
				{
					evencount++;
				}
				else
				{
					oddcount++;
				}
			}
			System.out.println("Even number:- "+evencount);
			System.out.println("odd number:- "+oddcount);
	}
}


class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
	
		int a[]=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		
		for(int i=0;i<size;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Smallest:- "+min);
	}
}
*/

class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
	
		int a[]=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		int max=a[0];
		
		for(int i=0;i<size;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			if(max<a[i])
			{
				max=a[i];
			}
			
		}
		System.out.println("Smallest:- "+min);
		System.out.println("largest:- "+max);
	}
}

