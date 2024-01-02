package Pratices;

public class Conditional_3 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int x=2000;
		int y=2500;
		int z=3000;
		int result=(x>y)?((y>z)? y:z):((z<x)? z:x);
		int aa=((y>z)? y:z);
		int bb=((z<x)? z:x);
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(result);
		

	}

}
