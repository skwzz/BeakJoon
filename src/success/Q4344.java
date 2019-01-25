package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *  4344번 : 평균은 넘겠지
 * @author kiwoong
 *
 */
public class Q4344 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int caseCnt = Integer.parseInt(br.readLine());
		int sNum;
		int[] arr;
		int sum = 0;
		int avg = 0;
		int overNum = 0;
		
		for(int i=0; i<caseCnt; i++) {
			st = new StringTokenizer(br.readLine());
			sNum = Integer.parseInt(st.nextToken());
			arr = new int[sNum];
			
			for(int j=0; j<sNum; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			
			avg = sum/sNum;
			
			for(int j=0; j<sNum; j++) {
				if(avg<arr[j]) {
					overNum++;
				}
			}
			
			System.out.println(String.format("%.3f", (double)overNum*100/sNum)+"%");
			
			sum = 0;
			avg = 0;
			overNum =0;
		}
	}
}
