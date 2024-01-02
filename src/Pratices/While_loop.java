package Pratices;

public class While_loop
{

	public static void main(String[] args) 
	{
		int x=500;
		int y=400;
		int z=250;
		while(x <y)
		{
			if(x > y)
			{
				System.out.println("it is a positive");
			}
			else if(x<=y)
			{
				System.out.println("it is a negetive number");
			}
			else if(z<x)
			{
				System.out.println("it is a true");
			}
			else
			{
				System.out.println("it is flase");
			}
			x--;
		}
		if(y > x)
		{
			System.out.println("it is right number");
		}
		else  if(y <=z)
		{
			System.out.println("it is a also right");
		}
		else if(y >=x)
		{
			System.out.println("it is a wrong number ");
		}
		else
		{
			System.out.println("it is a invailed number ");
		}
		
		
		if(z > x)
		{
			System.out.println("it is a prime number ");
		}
		else if(z <=x)
		{
			System.out.println("it is a not prime number");
		}
		else if(z < y)
		{
			System.out.println("it is a slient number");
		}
		else
		{
			System.out.println("it is a not slient number");
		}			
	}
} 



