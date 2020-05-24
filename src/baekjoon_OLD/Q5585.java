package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5585 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int target = 1000-num;
		
		int[] arr = {500, 100, 50, 10, 5, 1};
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			while(target>=arr[i]) {
				cnt++;
				target-=arr[i];
			}
		}
		System.out.print(cnt);
	}
}
