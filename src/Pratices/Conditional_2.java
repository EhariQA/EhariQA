package Pratices;

public class Conditional_2 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=600;
		int b=500;
		int c=300;
		int  result= (a<b)?((b>c)?b:a):((c<a)?a:c); //500 b 600 a
		int zz=(b>c)?b:a;
		int yy=(c<a)?a:c;
     	System.out.println(zz);
		System.out.println(yy);
		System.out.println(result);
		}

	}


