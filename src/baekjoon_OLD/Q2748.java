package baekjoon_OLD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * ?”¼ë³´ë‚˜ì¹? 2ë²?
 * @author kiwoong
 *
 */
public class Q2748 {
	static long[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		arr = new long[n+1];
		arr[0] = 1;
		arr[1] = 1;
		
		long answer = fibo(n);
		System.out.print(answer);
	}
	public static long fibo(int x) {
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
