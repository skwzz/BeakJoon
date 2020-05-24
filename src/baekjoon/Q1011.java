package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1011 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			int answer = 0;
			int jump = 1;
			while(true) {
				start+=jump;
				answer++;
				if(start>=end) {
					break;
				}else {
					end-=jump;
					answer++;
					if(start>=end) {
						break;
					}
				}
				jump++;
			}
			
			System.out.println(answer);
		}
	}
}
