
public class Exercise4_1 {

	public static void main1(String[] args) {
		int x = 15;
		
		if (x>10 && x<20)
			System.out.println(true);
		else
			System.out.println(false);
		
	}
	public static void main2(String[] args) {
		char ch = 'A';
		
		if (!(ch==' '))
				System.out.println(true);
		else
			System.out.println(false);
	
}
	public static void main3(String[] args) {
		char ch ='x';
		
		if (ch=='x' || ch=='X')
			System.out.println(true);
		else 
			System.out.println(false);
	}
	public static void main4(String[] args) {
		char ch =(char)(Math.random()*20 + '0');
		
		if (ch>='0' && ch<='9')
			System.out.println(true);
		else
			System.out.println(false);
	}
	public static void main(String[] args) {
		char ch = 'a';
		
		if (ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			System.out.println(true);
		else
			System.out.println(false);
	}
	public static void main6(String[] args) {
		
	}
	
	
}
