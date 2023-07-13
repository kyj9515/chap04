
public class EpochTimeExample {

	public static void main(String[] args) {
		long epoch = System.currentTimeMillis()/1000 + 9*60*60;
		
		
		int year = 1970;
		for (;;) {
			boolean isleap = (year%4==0 && year %100!=0) ||(year%400==0);
			int daysOfYear = isleap ? 366 : 365;
			if (epoch - daysOfYear*24*60*60 >= 0) {
				epoch = epoch - daysOfYear*24*60*60;
				year++;
			} else
				break;
				
		}
		int month = (int)epoch;
		System.out.println(year);
		System.out.println(epoch);
		System.out.println(month);
		

	}

}
