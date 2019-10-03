import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1912 {
	static int[] arr = new int[100001];
	static int[] dp = new int[100001];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
	}
}
