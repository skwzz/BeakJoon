package baekjoon_OLD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2193 {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int num = Integer.parseInt(br.readLine());
	
	long[][] arr = new long[2][num+1];
	
	arr[0][1] = 0;
	arr[1][1] = 1;
	for(int i=2; i<=num; i++) {
		arr[0][i] = arr[0][i-1] + arr[1][i-1];
		arr[1][i] = arr[0][i-1];
	}
	
	System.out.println(arr[0][num]+arr[1][num]);
	}
}

