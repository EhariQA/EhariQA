package p2;

public class Studentmarks
{
	public static void main(String[] args)
	{
		int marks=65;
		int totMarks=100;
		if(marks>100) {
			System.out.println("Grade = invalid");
		}
		else if(marks>95) {
			System.out.println("Grade = O");
		}
		else if(marks>85) {
			System.out.println("Grade = a");
		}
		else if(marks>70) {
			System.out.println("Grade = B");
		}
		else if(marks>60) {
			System.out.println("Grade = C");
		}
		else if(marks>45) {
			System.out.println("Grade = d");
		}
		else if(marks>35) {
			System.out.println("Grade = p");
		}
		else if(marks<35) {
			System.out.println("Grade = f");
		}
	}

}
