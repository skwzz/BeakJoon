package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2443 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n*2-1];
		
		for(int i=0; i<arr.length; i++) { // 0~4
			for(int j=0; j<i; j++) {
				sb.append(" ");
			}
			for(int j=arr[0].length-1; j>=i*2; j--) {   //9 7 5 3 1
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}
