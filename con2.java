import java.util.*;

class company
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Company name(1=GOOGLE,2=MICROSOFT,3=AMAZON),CGPA and SCORE");
		
		int NAME=sc.nextInt();
		int CGPA=sc.nextInt();
		int SCORE=sc.nextInt();
		
		if(NAME==1)
		{
			if(CGPA>7)
			{
				if(SCORE>600)
				{
					System.out.println("YOUR SELECT IN GOOGLE");
				}
				else
				{
					System.out.println("YOUR NOT SELECT IN GOOGLE");
				}
			}
			else
			{
				System.out.println("YOUR NOT SELECT IN GOOGLE");
			}
		}
		else if(NAME==2)
		{
			if(CGPA>7.5)
			{
				if(SCORE>750)
				{
					System.out.println("YOUR SELECT IN MICROSOFT");
				}
				else
				{
					System.out.println("YOUR NOT SELECT IN MICROSOFT");
				}
			}
			else
			{
				System.out.println("YOUR NOT SELECT IN MICROSOFT");
			}
		}
		else if(NAME==3)
		{
			if(CGPA>8)
			{
				if(SCORE>700)
				{
					System.out.println("YOUR SELECT IN AMAZON");
				}
				else
				{
					System.out.println("YOUR NOT SELECT IN AMAZON");
				}
			}
			else
			{
				System.out.println("YOUR NOT SELECT IN AMAZON");
			}
		}
		else
		{
			System.out.println("YOUR YOUR ENTERD WRONG COMPANY");
		}
	}
}