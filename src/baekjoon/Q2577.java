package baekjoon;
import java.util.Scanner;

public class Q2577 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int result = a*b*c;
		
		String str = Integer.toString(result);
		
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-'0']++;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
