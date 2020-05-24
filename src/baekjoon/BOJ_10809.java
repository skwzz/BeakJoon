package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Problem Name : ���ĺ� ã��
 * Problem Number : 10809
 * Problem Type : ���ڿ� ó��
 * 
 * @author KiwoongSon
 *
 */
public class BOJ_10809 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] checker = new int[26];
		Arrays.fill(checker, -1); // �迭 �ʱ�ȭ
		
		String str = br.readLine();
		for(int i=0; i<str.length(); i++) {
			char a = str.charAt(i);  // a : 97
			if(checker[a-97] == -1) {
				checker[a-97] = i;
			}
		}

		for(int val : checker) {
			System.out.print(val+" ");
		}
	}
}
