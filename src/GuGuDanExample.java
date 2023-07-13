
public class GuGuDanExample {

	public static void main(String[] args) {
		int count = 0;
		for (int i=1; i<=100; i++)
			for (int j=1; j<=100; j++)
				for (int k=1; k<=100; k++)
					if (i*i+j*j==k*k)
						System.out.printf("%3d, %3d, %3d\n",i*i, j*j,k*k);
					count++;
		
		System.out.println(count);
	}
	
	public static void main2(String[] args) {
		
		for (int i=1; i<10; i++) 
			for(int j=1; j<10; j++)
				if (i*j%2==0)	
				System.out.printf("%d X %d = %2d\n", i, j, i*j);	
	}
}
