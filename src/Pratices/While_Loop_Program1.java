package Pratices;
public class While_Loop_Program1 {
	public static void main(String[] args) {
		int n=127;
		int num=n;
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("reverse is: "+rev);
		if(n==rev) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
	}
}
