package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2523 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		int temp = 0;
		int blank = n-1;
		boolean goDown = true;
		
		while(temp<2*n-1) {
			
			for(int i=0; i<blank; i++) {
				sb.append(" ");
			}
			for(int i=n; i>blank; i--) {
				sb.append("*");
			}
			
			
			if(goDown) {
				blank--;
			}else {
				blank++;
			}
			
			if(blank==0) {
				goDown=false;
			}
			temp++;
			if(temp<2*n-1) {
				sb.append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}
