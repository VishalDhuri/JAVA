import java.util.*;

/*class number
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Two Number");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("1:add 2:sub:3:mul 4:div");
		int c=sc.nextInt();
		
		switch(c)
		{
			case 1:
			System.out.println("Addition is "+(a+b));
			break;
			
			case 2:
			System.out.println("Sub is "+(a-b));
			break;
			
			case 3:
			System.out.println("Mul is "+(a*b));
			break;
			
			case 4:
			System.out.println("Div is "+(a/b));
			break;
			
			default :
			System.out.println("Invaild");
			
		}
		
	}
}*/

class chars
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your character");
		
		char ch=sc.next().charAt(0);
		
		
		switch(ch)
		{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'U':
			case 'u':
				System.out.println("IT IS VOWEL");
			break;
			
			default:
				System.out.println("IT IS CONSONANTS");
		}
		
	}
}