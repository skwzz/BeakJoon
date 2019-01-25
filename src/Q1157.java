import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.BufferedReader;

public class Q1157 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		
		String str = br.readLine();
		
		//65-90
		//97-122
		
		str = str.toLowerCase();
		int n = 0;
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i)-'a');
			n = str.charAt(i)-'a';
			arr[n]++;
		}
		
		for(int i=0; i<arr.length ;i++) {
			System.out.print(arr[i]+" ");
		}
		int maxCnt = getMax(arr);
	}
	
	public static int getMax(int[] arr) {
		System.out.println("\n----getMax----");
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		return -1;
	}
}
