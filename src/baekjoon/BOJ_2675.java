package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Problem Name : 문자열 반복
 * Problem Number : 2675
 * Problem Type : 문자열 처리
 * 
 * @author KiwoongSon
 *
 */
public class BOJ_2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int l_cnt = Integer.parseInt(br.readLine());
		
		for(int i=0; i<l_cnt; i++) {
			String[] str = br.readLine().split(" ");
			String targetStr = str[1];
			int loop = Integer.parseInt(str[0]);
			
			for(int j=0; j<targetStr.length(); j++) {
				char c = targetStr.charAt(j);
				
				for(int k=0; k<loop; k++) {
					System.out.print(c);
				}
			}
			System.out.println("");
		}
	}
}
