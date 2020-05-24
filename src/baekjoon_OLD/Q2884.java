package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2884 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());	// 0 <= hour <= 23
		int minute = Integer.parseInt(st.nextToken());	// 0 <= hour <= 59
		
		int alarm = minute - 45;
		
		if(alarm<0) {
			hour -= 1;
			if(hour<0) {
				hour = 23;
			}
			alarm = 60 - Math.abs(alarm);
		}
		
		System.out.println(hour+" "+alarm);
	}
}
