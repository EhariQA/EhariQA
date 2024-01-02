package Pratices;

public class Non_staticmethod 
{

	public void show()
	{
		String a="hari";
		String b="venky";
		String c="a+b";
		System.out.println(a+ "is" + b);
	}
	public void display()
	{
		String name1="chennaiah";
		String name2="ramu";
        String name=name1 + name2;
		System.out.println(name);
	}
	public static void main(String[]args)
	{
		int a=12;
		int b=23;
		int c=a+b;
		System.out.println("c vaiueis:"+c);
		Non_staticmethod ob=new Non_staticmethod();
		ob.show();
		ob.display();
		
		

	}

}
