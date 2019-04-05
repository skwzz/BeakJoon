package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149 {
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		arr = new int[num+1][3];
		
		int minV;
		for(int i=1; i<arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
			
			arr[i][0] += Math.min(arr[i-1][1], arr[i-1][2]);
			arr[i][1] += Math.min(arr[i-1][0], arr[i-1][2]);
			arr[i][2] += Math.min(arr[i-1][0], arr[i-1][1]);
		}
		minV = Math.min(Math.min(arr[num][0], arr[num][1]), arr[num][2]);
		System.out.println(minV);
	}
}
