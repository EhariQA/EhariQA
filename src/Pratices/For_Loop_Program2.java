package Pratices;
public class For_Loop_Program2 
{
	public static void main(String[] args) 
	{
		int n=9;
		int count=0;
		for(int i=1; i<=n; i++) 
		{
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("It is a Prime Number");
		}
		else {
			System.out.println("It is not a Prime Number");
		}
	}
}
