
public class Exercise05 {

	public static void main(String[] args) {
		int totalSum = 0;
		
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=i; j++)
				totalSum += j;
			
		
		}
		System.out.println(totalSum);
		
		totalSum = 0;
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum = sum + i;
			totalSum = totalSum + sum;
		}
		System.out.println(totalSum);
	}


}
