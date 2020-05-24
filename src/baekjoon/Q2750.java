package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * ?„¸ ?ˆ˜ ? •? ¬?•˜ê¸?
 * @author kiwoong
 *
 */
public class Q2750 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int size = arr.length;
		
		for(int i=0; i<size; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//SelectSort
		int idx;
		for(int i=0; i<size; i++) {
			idx = i;
			for(int j=i; j<size; j++) {
				if(arr[idx]>arr[j]) {
					idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
		
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]+" ");
		}
		System.out.println(sb);
	}
}
