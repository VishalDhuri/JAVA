class outer
{
	class inner
	{
		public void show()
		{
			System.out.println("Show method in inner class");
		}
	}
}
class operator2
{
	
	public static void main(String args[])
	{
		outer obj=new outer();
		outer.inner obj1=obj.new inner();
		obj1.show();
	}
}


class p
{
	class rutu
	{
		public void om()
		{
			System.out.println("i love you RUTU and OMI");
		}
	}
}

class pra
{
	public static void main(String agrs[])
	{
		p p1=new p();
		p.rutu r1=p1.new rutu();
		r1.om();
	}
}