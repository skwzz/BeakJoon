package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem Name : 숫자의 합
 * Problem Number : 11720
 * 
 * @author KiwoongSon
 *
 */
public class BOJ_11720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int result = 0;
		
		for(int i=0; i<len; i++) {
			result += str.charAt(i)-48;
		}
		
		System.out.println(result);
		
	}
}
