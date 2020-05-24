package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2920 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[8];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int flag = 0; // 0 : mixed   1 : ascending  2 : descending
		if(arr[0]==1) {
			flag = 1;
		}else if(arr[0]==8){
			flag = 2;
		}
		
		
		for(int i=0; i<arr.length-1; i++) {
			if(flag==1) {
				if(arr[i]>arr[i+1]) {
					System.out.print("mixed");
					return;
				}
			}else {
				if(arr[i]<arr[i+1]) {
					System.out.print("mixed");
					return;
				}
			}
		}
		if(flag==1) {
			System.out.print("ascending");
		}else {
			System.out.print("descending");
		}
		
		
	}
}
