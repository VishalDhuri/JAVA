import java.util.*;
/*
class dowhileloop
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num;
		
		  do{  
				
				System.out.println("Hello World");
				
				num=sc.nextInt();
			}
			while(num==1);
	}
}

class dowhileloop
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num;
		
		  do{  
				
				System.out.println("Enter Two Numbers");
				int a=sc.nextInt();
				int b=sc.nextInt();
				
				System.out.println("Addition is "+(a+b));
				System.out.println("Press 1:Restart and 0:Stop");
				num=sc.nextInt();
			}
			while(num==1);
	}
}


class dowhileloop
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int rev=0;
		
			while(num>0)
			{
				int rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			};
			System.out.println("Reverse Number "+rev);
	}
}

*/


class dowhileloop
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int onum=num;
		int rev=0;
		
			while(num>0)
			{
				int rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			if(onum==rev)
			{
				System.out.println("It Is Palindrome");
			}
			else
			{
				System.out.println("It Is Not Palindrome");
			}
			
	}
}



