import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1916 {
	static int[][] arr;
	static int[] dist;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		arr = new int[num+1][num+1];
		dist = new int[num+1];
		
		int edge = Integer.parseInt(br.readLine());
		
		for(int i=0; i<edge; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			arr[num1][num2] = weight;
		}
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		printArr();
	}
	
	public static void printArr() {
		for(int i=1; i<arr.length; i++) {
			for(int j=1; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}
