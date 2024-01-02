package p1;
public class StaticMethods
{
	static int m=10;
	int n=20;
	public static void show() 
	{
		String name1="Venkatesh";
		String name2="Play boy";
		System.out.println(name1+" is "+name2);
	}
	public static void display() 
	{
		int x=10;
		int y=20;
		int z=x+y+m;
		System.out.println("Z value is : "+z);
	}
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=a+b+m;
		System.out.println("C value is : "+c);
		StaticMethods.display();
		StaticMethods.show();
	}
}
