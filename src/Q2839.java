import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		
		while(true) {
			if(n==0) {
				break;
			}
			
			if(n%5==0) {
				n-=5;
				result++;
			}else if(n%3==0) {
				n-=3;
				result++;
			}else {
				System.out.print("-1");
				return;
			}
		}
		System.out.print(result);
	}
}
