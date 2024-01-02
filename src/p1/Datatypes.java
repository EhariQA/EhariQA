package p1;

public class Datatypes 
{

	public static void main(String[] args)
	{		
		/* Datatypes in java are two types 
		 * 1. Primitive Datatypes
		 * 2. NonPrimitive Datatypes
		*/
		
		int a=10; // integer variable storing integer value
		int b=20; // integer variable storing integer value
		int c=a+b; // integer variable storing addition of two integer values.
		System.out.println("Sum of "+a+" and "+b+" = "+c);// printing the values what we want.
		
		
		long phno=9898989898L; // long variable storing Long value. we should represent the long value with 'L' character.
		System.out.println("Phone number is : "+phno); // Printing the long value which is Phone number.
		
		
		float f=123.44f; // float variable storing float value. float value represented with 'f' character.
		double d=123.552655; // double variable storing double value.
		System.out.println("Float vlaue : "+f); // printing float value.
		System.out.println("Double value : "+d);// printing double value.
		
		char alphabet='a'; // character variable storing char value
		
		String name="venkatesh"; // String variable storing string value.
		System.out.println("Name of the Student : "+name); // printing string value.
	}

}
