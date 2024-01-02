package Pratices;
public class For_Loop_Program 
{
	public static void main(String[] args) 
	{
		for(int i=0; i<100; i++)
		{
			if(i%3==0 && i%5==0) 
			{
				System.out.println("Hari Nagaraju");
			}
			else if(i%5==0) 
			{
				System.out.println("Hari");
			}
			else if(i%3==0)
			{
				System.out.println("Nagaraju");
			}
			else 
			{
				System.out.println(i);
			}
		}
	}
}
