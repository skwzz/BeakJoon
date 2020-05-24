package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem Name : 단어공부
 * Problem Number : 1157
 * Problem Type : 문자열 처리
 * 
 * @author KiwoongSon
 *
 */
public class BOJ_1157 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] aArr = new int[26];
		
		// a - z : 97 - 122
		// A - Z : 65 - 90
		// 세팅
		for(int i=0; i<str.length(); i++) {
			int n = (int)str.charAt(i);
			int w = 0;
			
			if(n>=65 && n<=90) {
				w = 65;
			}else if(n>=97 && n<=122) {
				w = 97;
			}
			aArr[n-w]++;
		}
		
		// 출력
		int maxNum = 0;
		int maxIdx = 0;
		boolean isMaxDup = false;
		
		for(int i=0; i<aArr.length; i++) {
			if(aArr[i] >= maxNum) {
				if(aArr[i] == maxNum) {
					isMaxDup = true;
				}else if(aArr[i] > maxNum){
					isMaxDup = false;
				}
				maxNum = aArr[i];
				maxIdx = i;
			}
		}
		if(isMaxDup) {
			System.out.println("?");
		}else {
			System.out.println((char)(maxIdx+65));
		}
	}
}

