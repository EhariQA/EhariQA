
public class Non_static
{
	public void bhanu()

	{
		String name1="hari";
		String name2="bhanu";
		String name3=name1+name2;
		System.out.println(name3);
	}
	public void chennaiah()
	{
		String a="chennaiah";
		String b="hari";
		String c=a+b;
		System.out.println("c vaiue ="+c);
	}
	public static void main(String[] args) 
	{
		String a="maruthi";
		String b="venkat";
		String c=a+b;
		System.out.println("c value ="+c);
		 Non_static ob=new Non_static();
		 ob.bhanu();
		 ob.chennaiah();
		
		
		
	

	}

}
