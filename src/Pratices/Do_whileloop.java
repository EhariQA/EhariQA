package Pratices;

public class Do_whileloop 
{

	public static void main(String[] args)
	{
		int x=600;
		int y=400;
		
		do 
		{
			System.out.println("it is value of x");
			y++;
		}
		while(x > y);
		
		
		System.out.println("x value: "+x);
		System.out.println("Y value: "+y);
		if(x < y)
		{
		System.out.println("it is value of b");
		}
		else if(x>y)
		{
			System.out.println("it is value of c");
		}
		else
		{
			System.out.println("it is a not values");
		}
			
		

	}
}


