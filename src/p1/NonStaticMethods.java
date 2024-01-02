package p1;
public class NonStaticMethods 
{
	public void display() 
	{
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println("C value of display method is : "+c);
	}
	public void show()
	{
		int x=50;
		int y=30;
		int z=x+y;
		System.out.println("Z value of Show method is : "+z);
	}
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=b-a;
		System.out.println("C value of main method is : "+c);
		
		//Object Creation Process is as shown below:
		// "ClassName variableName = new ClasName();"
		NonStaticMethods ob=new NonStaticMethods();
		ob.display();
		ob.show();
	}
}
