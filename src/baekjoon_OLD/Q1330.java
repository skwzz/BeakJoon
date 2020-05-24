package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1330 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[2];
		int idx = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		if(arr[0]>arr[1]) {
			System.out.println(">");
		}else if(arr[0]<arr[1]) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		
		
	}
}
