package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10844 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int n = Integer.parseInt(br.readLine());
	    long[][] arr = new long[101][11];
	 
	    for (int i = 1; i <= 9; i++) {
	        arr[1][i] = 1;
	    }
	 
	    for (int i = 2; i <= n; i++) {
	        arr[i][0] = arr[i - 1][1];
	        for (int j = 1; j <= 9; j++) {
	            arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j + 1]) % 1000000000;
	        }
	    }
	 
	    long sum = 0;
	    for (int i = 0; i < 10; i++) {
	        sum += arr[n][i];
	    }
	    System.out.println(sum % 1000000000);


	}
}
