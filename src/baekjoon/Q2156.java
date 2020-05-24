package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2156 {
	static int[] arr;
	static int[] point;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		arr = new int[10001];
		point = new int[10001];
		
		for(int i=1; i<=num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		point[0] = 0;
		point[1] = arr[1];
		point[2] = point[1] + arr[2];
		
		
		for(int i=3; i<=num; i++) {
			point[i] = Math.max(point[i-2]+arr[i], point[i-3]+arr[i]+arr[i-1]);
			point[i] = Math.max(point[i-1], point[i]);
		}
		
		System.out.println(point[num]);
	}
}
