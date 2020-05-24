package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2908 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		a = reverseNum(a);
		b = reverseNum(b);
		
		if(a>b) {
			System.out.print(a);
		}else {
			System.out.print(b);
		}
	}
	static int reverseNum(int num) {
		String str = Integer.toString(num);
		
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		
		return Integer.parseInt(sb.toString());
	}
}
