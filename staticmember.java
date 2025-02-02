import java.util.*;

class employee
{
	int salary;
	String name;
	static String institut="IT VEDANT";
	
}


class operator
{
	public static void main(String args[])
	{
		
		employee.institut="IT";  //if static are there you can change institut nasa as welll
		
		
		employee e1=new employee();
		System.out.println(e1.salary);
		System.out.println(e1.name);
		System.out.println(e1.institut);
		
		
		employee e2=new employee();
		System.out.println(e2.salary);
		System.out.println(e2.name);
		System.out.println(e2.institut);
		
	}
}



class employee2
{
	int Age;
	String Name;
	static String Country="India";
	
}


class operator1
{
	public static void main(String args[])
	{
		
		employee2 e2=new employee2();
		System.out.println(e2.Age);
		System.out.println(e2.Name);
		System.out.println(e2.Country);

		
	}
}