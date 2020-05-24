package baekjoon;
import java.util.Scanner;

public class Q11720 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.next();
		
		int result = 0;
		int temp = 0;
		for(int i=0; i<str.length(); i++) {
			temp = Integer.parseInt(String.valueOf(str.charAt(i)));
			result += temp;
		}
		System.out.print(result);
		
	}
}
