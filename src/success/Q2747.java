package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 피보나치 1번
 * @author kiwoong
 *
 */
public class Q2747 {
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		arr = new int[n+1];
		arr[0] = 1;
		arr[1] = 1;
		
		int answer = fibo(n);
		System.out.print(answer);
	}
	public static int fibo(int x) {
		if(x==1 || x==2) {
			return arr[x-1];
		}else if(arr[x-1]>0) {
			return arr[x-1];
		}else {
			arr[x-1] = fibo(x-1) + fibo(x-2);
			return arr[x-1];
		}
	}
}
