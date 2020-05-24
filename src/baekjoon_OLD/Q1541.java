package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1541 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str = br.readLine();
		
		st = new StringTokenizer(str, "-");
		
		String[] arr = new String[st.countTokens()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = st.nextToken();
		}
		
		for(int i=0; i<arr.length; i++) {
			st = new StringTokenizer(arr[i], "+");
			int sum = 0;
			
			while(st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			arr[i] = Integer.toString(sum);
		}
		
		int answer = 0;
		for(int i=0; i<arr.length; i++) {
			if(i==0) {
				answer += Integer.parseInt(arr[i]);
				continue;
			}
			
			answer -= Integer.parseInt(arr[i]);
		}
		
		System.out.println(answer);
		
		
	}
}
