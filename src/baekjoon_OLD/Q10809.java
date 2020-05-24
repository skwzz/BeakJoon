package baekjoon_OLD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10809 {
	static int[] arr;
	public static void main(String[] args) throws IOException{
		arr = new int[26];
		int arrLen = arr.length;
		for(int i=0; i<arrLen; i++) {
			arr[i] = -1;
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // 97 ~ 122
		char[] ca = str.toCharArray();
		
		int caLen = ca.length;
		for(int i=0; i<caLen; i++) {
			if(arr[ca[i]-97] == -1) {
				arr[ca[i]-97] = i;
			}
		}
		
		for(int i=0; i<arrLen; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
