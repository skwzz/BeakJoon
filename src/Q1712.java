import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Q1712 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long c = Long.parseLong(st.nextToken());
		
		long idx = 1;
		if(b>=c) {
			System.out.print(-1);
		}else {
			while(true) {
				long sum = a + (b*idx);
				
				if(sum<(c*idx)) {
					System.out.println(idx);
					break;
				}else if(sum==(c*idx)) {
					System.out.println(idx+1);
					break;
				}
				
				idx++;
			}
		}
	}
}
