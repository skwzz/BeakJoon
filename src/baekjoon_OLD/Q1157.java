package baekjoon_OLD;
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
			n = str.charAt(i)-'a';
			arr[n]++;
		}
		
		int maxValue = getMax(arr);
		int maxCnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==maxValue) {
				maxCnt++;
			}
		}
		
		int idx = 0;
		char answer = ' ';
		if(maxCnt>1) {
			System.out.println("?");
		}else {
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==maxValue) {
					idx = i;
					break;
				}
			}
			answer = (char)('A'+idx);
			System.out.println(answer);
		}
	}
	
	public static int getMax(int[] arr) {
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}

		return max;
	}
}
