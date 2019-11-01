package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1182 {
	static int[] arr;
	static boolean[] includes;
	static int s;
	static int n;
	static int answer;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		
		answer = 0;
		
		arr = new int[n];
		includes = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		ps(0);
		if(s==0) {
			answer--;
		}
		System.out.println(answer);
		
	}
	public static void ps(int k) {
		if(k == arr.length) {
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				if(includes[i]) {
					sum+=arr[i];
				}
			}
			if(sum==s) {
				answer++;
			}
		}else {
			includes[k] = false;
			ps(k+1);
			includes[k] = true;
			ps(k+1);
		}
	}
}
