package Pratices;

public class Hari_nestedif  
{

	public static void main(String[] args)
	{
		int x=200;
		int y=100;
		if(x>y)
		{
			if(x<=y)
			{
				System.out.println("it is a even number");
			}
			else if(x<100)
			{
				System.out.println("it is odd number");
			}
			else
			{
				System.out.println("it is a not even number");
			}
		}
		else if(y > x)
		{
			System.out.println("it is prime number");
		}
		if(y>=x)
		{
			System.out.println("it is right");
		}
		else if(y<x)
		{
			System.out.println("it is also right");
		}
		else
		{
			System.out.println("it is invalied number");
		}
			
			
		
		}
	}


