package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1110 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 0 <= n <= 99
		int base = n;
		int cnt = 0;
		
		
		do {
			cnt++;
			n = plusCycle(n);
		}while(base!=n);
		
		System.out.println(cnt);
	}
	public static int plusCycle(int n) {
		/*
		 * 1. n이 10보다 작으면 앞에 0을 붙여 두 자리수를 만들고 ( 6 -> 06 )
		 * 2. 각 자리의 숫자를 더한다 ( 0 + 6 = 6 )
		 * 주어진 수의 가장 오른쪽 수 + 합으로 구한 수의 가장 오른쪽 수 더한다
		 */
		if(n<10) {
			return (10*n)+n;
		}
		int sum = 0;
		sum = n/10 + n%10;
		return (n%10)*10 + sum%10;
	}
}
