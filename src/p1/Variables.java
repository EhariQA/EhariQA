package p1;
public class Variables {
	// According to static keyword Variables are categorized into two types. 
	//  i. Static variables.
	//  ii.NonStatic Variables.
	// i. Static Variable: a variable which is declared inside a class with static keyword is called static variable.it is also called as class variable.
	// a Static variable can be used or accessed at any place in the class.
	
	static int num=100; // num is static variable.
	
	
	// ii. NonStatic Variable: There are two types of nonStatic variables.
	// 	1.Instance Variable.
	//  2.Local Variable.
	// 1.Instance Variable: a variable which is declared inside a class without static keyword is known as Instance variable.
	int b=200; // b is a instance variable.
	
	// 2.Local Variable: a Variable which is declared inside a method is known as Local Variable. A local variable can't be static variable. because we can't use the local variable outside the method.
	public static void main(String[] args) {
		int a=10; // a is a local variable.
		System.out.println(a); // a can be accessed in this method only(ie.., main method only)
		// System.out.println(b); // b can't be accessed in methods because it is an instance variable.
		System.out.println(num); // num can be accessed at any place because it is a static variable.
	}
}
