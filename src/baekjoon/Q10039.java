package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10039 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int point = 0;
		int result = 0;
		
		for(int i=0; i<5; i++) {
			point = Integer.parseInt(br.readLine());
			
			if(point<40) {
				result+=40;
			}else {
				result+=point;
			}
		}
		
		System.out.print(result/5);
	}
}
