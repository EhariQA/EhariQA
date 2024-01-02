package Pratices;

public class Conditional_22 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=1000;
		int b=800;
		int c=500;
		int result=(a<b)?((b>a)? b:a):((c>a)? a:c);
		int xx=(b>a)? b:a;
		int yy=(c>a)? a:c;
		System.out.println(xx);
		System.out.println(yy);
		System.out.println(result);

	}

}
