package baekjoon;
import java.util.Scanner;

public class Q1065 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // 1<= N <=1000
		int count = 0;
		
		for(int i=1; i<=n; i++) {
			if(isHansu(i)) {
				count++;
			}
		}
		
		
		System.out.print(count);
	}
	
	public static boolean isHansu(int n) {
		// 1?žë¦?, 2?žë¦? ?ˆ˜?Š” ?•œ?ˆ˜
		if(n<100) {
			return true;
		}
		//1000?? ?•œ?ˆ˜ ?•„?‹˜
		if(n==1000) {
			return false;
		}
		// 100~999 ?•œ?ˆ˜ ?Œë³?
		int[] arr = new int[3];
		
		for(int i=0; i<3; i++) {
			arr[i] = Integer.toString(n).charAt(i)-'0';
		}
		
		if(arr[0]-arr[1] == arr[1]-arr[2]) {
			return true;
		}else {
			return false;
		}
		
	}
}
