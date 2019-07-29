package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10214 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCase; i++) {
			int y = 0;
			int k = 0;
			for(int j=0; j<9; j++) {
				st = new StringTokenizer(br.readLine());
				y += Integer.parseInt(st.nextToken());
				k += Integer.parseInt(st.nextToken());
			}
			if(y>k) {
				System.out.println("Yonsei");
			}else if(y<k) {
				System.out.println("Korea");
			}else {
				System.out.println("Draw");
			}
		}
	}
}
