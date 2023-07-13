import java.awt.FocusTraversalPolicy;

public class ForStatementExample {
	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
		for (int i=1; i<=100; i++) {
			if (i%2==0)
				evenSum += i;
			else
				oddSum = oddSum + i;
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
	}
	
	
	
	
	public static void main4(String[] args) {
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			sum = sum + i;
			System.out.println(i);
				
		}
		
		System.out.println(sum);
		
	}
	public static void main3(String[] args) {
		
		for(;;)		// 무한 루프
			System.out.println("...");
	}
	
	

	public static void main2(String[] args) {
			
		for (int i=1; i<=10; i++)
			System.out.println(i);
	}

}
