package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3052 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		int cnt=1;
		for(int i=0; i<arr.length-1; i++) {
			boolean check = false;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					check = true;
					break;
				}
			}
			if(!check) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
	}
}
