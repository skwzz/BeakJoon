package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10818 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int leng = Integer.parseInt(br.readLine());
		
		int min = 1000001;
		int max = -1000001;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<leng; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(min>num) {
				min = num;
			}
			if(max<num) {
				max = num;
			}
		}
		System.out.println(min+" "+max);
	}
}
