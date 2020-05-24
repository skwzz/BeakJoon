package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1110 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 0 <= n <= 99
		int base = n;
		int cnt = 0;
		
		
		do {
			cnt++;
			n = plusCycle(n);
		}while(base!=n);
		
		System.out.println(cnt);
	}
	public static int plusCycle(int n) {
		/*
		 * 1. n?´ 10ë³´ë‹¤ ?‘?œ¼ë©? ?•?— 0?„ ë¶™ì—¬ ?‘ ?ë¦¬ìˆ˜ë¥? ë§Œë“¤ê³? ( 6 -> 06 )
		 * 2. ê°? ?ë¦¬ì˜ ?ˆ«?ë¥? ?”?•œ?‹¤ ( 0 + 6 = 6 )
		 * ì£¼ì–´ì§? ?ˆ˜?˜ ê°??¥ ?˜¤ë¥¸ìª½ ?ˆ˜ + ?•©?œ¼ë¡? êµ¬í•œ ?ˆ˜?˜ ê°??¥ ?˜¤ë¥¸ìª½ ?ˆ˜ ?”?•œ?‹¤
		 */
		if(n<10) {
			return (10*n)+n;
		}
		int sum = 0;
		sum = n/10 + n%10;
		return (n%10)*10 + sum%10;
	}
}
