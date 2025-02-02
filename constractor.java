
import java.util.*;



//non parametaries constractor 
/*
class student
{
	Scanner sc=new Scanner(System.in);
	int rollno;
	String name;
	
	
	student()
	{
		System.out.println("Object created");
		
		this.name=sc.nextLine();
		this.rollno=sc.nextInt();
		System.out.println("Name:"+this.name+" ID:"+this.rollno);
	}
}

class operator
{
	public static void main(String args[])
	{
		student s1=new student();
		student s2=new student();
		student s3=new student();
		student s4=new student();
	}
}



// parametaries constractor 



class rectangle
{
	int length;
	int breadth;
	
	
	
	rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
		System.out.println("Area of rectangle is "+(length*breadth));
	}
	
	
}

class operator2
{
	public static void main(String args[])
	{
		rectangle r1=new rectangle(20,30);
		System.out.println(r1.length);
		rectangle r2=new rectangle(10,10);
	}
}

*/
	
	
//
	
class rectangle
{
	Scanner sc=new Scanner(System.in);
	int length;
	int breadth;
	
	
	
	rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
		System.out.println("Area of rectangle is "+(length*breadth));
	}
	
	rectangle()
	{
		this.length=sc.nextInt();
		this.breadth=sc.nextInt();
		
		System.out.println("Area of rectangle is "+(this.length*this.breadth));
	}
	
	
	
}

class operator2
{
	public static void main(String args[])
	{
		rectangle r1=new rectangle();
		
		rectangle r2=new rectangle(15,15);
	}
}

//task for ous:-find out the predefine method
//need to declear salary and String

class employee
{
	int salary;
	String name;
	
	
	employee
}


class operator3
{
	public static void main(String args[])
	{
		employee e1=new employee();
	}
}