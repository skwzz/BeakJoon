import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2675 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int cnt = Integer.parseInt(br.readLine());
		int a = 0;
		String str = "";
		for(int i=0; i<cnt; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			a = Integer.parseInt(st.nextToken());
			str = st.nextToken();
			
			for(int j=0; j<str.length(); j++) {
				for(int k=0; k<a; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println("");
		}
		
	}
}
