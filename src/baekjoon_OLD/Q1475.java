package baekjoon_OLD;
import java.util.Scanner;

public class Q1475 {
	static int[] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int num;
		arr = new int[9]; // 6?��?�� 9?�� 6?�� ?��꺼번?�� ?��?��?��
		
		//?��?���? ?��?��?�� 꺼내 ?��?�� 배열?�� ?��?��?�� (6, 9?�� arr[6]?���?)
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
		
		//배열�? arr[6]?�� ?��?��?�� ?��머�? ?��?���? 최�?�?(최소 ?��?��?��?��?��)?�� 갖는 ?��치의 idx�? ???��
		for(int i=0; i<arr.length; i++) {
			if(i==6) {
				continue;
			}
			if(max<arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		
		//arr[6]?�� 값을 ?��?��?�� 최소 ?��?�� ?��?��?���? 구함
		int n = arr[6];
		if(n%2!=0) {
			n = n/2+1;
		}else {
			n/=2;
		}
		
		//?�� 최소 ?��?�� ?��?���? 최�?값을 구해 출력
		System.out.print(Math.max(arr[idx], n));
		
		
	}
}
