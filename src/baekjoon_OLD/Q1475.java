package baekjoon_OLD;
import java.util.Scanner;

public class Q1475 {
	static int[] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int num;
		arr = new int[9]; // 6?´?‘ 9?Š” 6?— ?•œêº¼ë²ˆ?— ?„£?Š”?‹¤
		
		//?ˆ«?ë¥? ?•˜?‚˜?”© êº¼ë‚´ ?•´?‹¹ ë°°ì—´?— ?„£?Š”?‹¤ (6, 9?Š” arr[6]?œ¼ë¡?)
		for(int i=0; i<str.length(); i++) {
			num = Integer.parseInt(str.charAt(i)+"");
			if(num==9) {
				arr[6]++;
			}else {
				arr[num]++;
			}
		}
		
		int max = 0;
		int idx = 0;
		
		//ë°°ì—´ì¤? arr[6]?„ ? œ?™¸?•œ ?‚˜ë¨¸ì? ?š”?†Œì¤? ìµœë?ê°?(ìµœì†Œ ?•„?š”?„¸?Š¸?ˆ˜)?„ ê°–ëŠ” ?œ„ì¹˜ì˜ idxë¥? ???¥
		for(int i=0; i<arr.length; i++) {
			if(i==6) {
				continue;
			}
			if(max<arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		
		//arr[6]?˜ ê°’ì„ ?‚¬?š©?•´ ìµœì†Œ ?•„?š” ?„¸?Š¸?ˆ˜ë¥? êµ¬í•¨
		int n = arr[6];
		if(n%2!=0) {
			n = n/2+1;
		}else {
			n/=2;
		}
		
		//?‘ ìµœì†Œ ?•„?š” ?„¸?Š¸ì¤? ìµœë?ê°’ì„ êµ¬í•´ ì¶œë ¥
		System.out.print(Math.max(arr[idx], n));
		
		
	}
}
