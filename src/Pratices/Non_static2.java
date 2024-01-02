package Pratices;

public class Non_static2
{
	public void hari()
	{
		String a="abc";
		String b="efg";
		String c="a+b";
		System.out.println("c value is="+c);
	}
	public void ramu()
	{
		long a=964070l;
		long b=7190l;
		long c=a+b;
		System.out.println("c value is:"+c);
	}
	public static void main(String[]args)
	{
		int a=80;
		int b=60;
		int c=a+b;
		System.out.println("c value is:"+c);
		Non_static2 g=new Non_static2();
		g.hari();
		g.ramu(); 
		
		
	}
}
	
	
		
	
	
	


	
	

	


