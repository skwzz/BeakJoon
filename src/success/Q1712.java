package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1712 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		/*
		 * a : 고정비용
		 * b : 가변비용
		 * (a=1000 b=70 일경우 1개 생산시 1070 / 10개 생산시 1700)
		 * c : 판매비용
		 */
		
		if(b>=c) {
			System.out.println("-1");
		}else {
			int temp1 = c - b; // 100
			int temp2 = a/temp1;
			System.out.println(temp2+1);
		}
	}
}
