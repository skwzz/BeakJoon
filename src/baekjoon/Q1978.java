package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int answer = 0;
		while(st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			if(isPrime(temp)) {
				answer++;
			}
		}
		System.out.println(answer);
	}
	
	static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}else if(n==2) {
			return true;
		}else {
			int temp = (int)Math.sqrt(n);
			for(int i=2; i<=temp; i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
	}
}
