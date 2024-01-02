package p3;
public class OrangesMangos {
	public static void main(String[] args) {
		int n=100;
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("mangoorange");
			}
			else if(i%3==0) {
				System.out.println("orange");
			}
			else if(i%5==0) {
				System.out.println("mango");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
