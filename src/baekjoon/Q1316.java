package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1316 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		String str;
		for(int i=0; i<n; i++) {
			str = br.readLine();
			if(isGroupWord(str)) {
				answer++;
			}
		}
		System.out.print(answer);
	}
	public static boolean isGroupWord(String str) {
		int[] checker = new int[26];
		boolean flag = false;
		char c;
		char beforeC=' ';
		for(int i=0; i<str.length(); i++) {
			c = str.charAt(i);
			//처음
			if(beforeC==' ') {
				beforeC=c;
				continue;
			}else {
				if(beforeC == c) { //?��?�� 문자�? 방금 ?��?�� 문자?? ?��같다�?
					continue;
				}else { //?��르다�?
					if(checker[c-'a']!=0) {
						return false;
					}else {
						checker[beforeC-'a']++;
						beforeC=c;
					}
				}
				
			}
		}
		return true;
	}
}
