import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q1924 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		int date = in.nextInt();
		
		GregorianCalendar gc=new GregorianCalendar ( 2007, month-1 , date ); 
		String [] dayOfWeek = { "", "SUM", "MON", "TUE", "WED", "THU", "FRI", "SAT"}; 

		System.out.print(dayOfWeek[gc.get(gc.DAY_OF_WEEK)]);
	}
}
