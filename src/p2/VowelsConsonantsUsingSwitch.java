package p2;
public class VowelsConsonantsUsingSwitch {
	public static void main(String[] args) {
		char c='o';
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(c +" is an vowel");
			break;
		default:
			System.out.println(c+" is a Consonant");
		}
	}
}
