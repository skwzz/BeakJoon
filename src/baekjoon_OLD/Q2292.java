package baekjoon_OLD;
import java.util.Scanner;

public class Q2292 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int cnt = 1;
		int range = 1;
		int mul = 1;
		
		while(true) {
			if(range>=n) {
				break;
			}
			mul = 6 * cnt;
			cnt++;
			
			range += mul;
		}
		
		System.out.print(cnt);
	}
}
