package baekjoon_OLD;
import java.util.Scanner;

public class Q1475 {
	static int[] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int num;
		arr = new int[9]; // 6?΄? 9? 6? ?κΊΌλ²? ?£??€
		
		//?«?λ₯? ???© κΊΌλ΄ ?΄?Ή λ°°μ΄? ?£??€ (6, 9? arr[6]?Όλ‘?)
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
		
		//λ°°μ΄μ€? arr[6]? ? ?Έ? ?λ¨Έμ? ??μ€? μ΅λ?κ°?(μ΅μ ???Έ?Έ?)? κ°λ ?μΉμ idxλ₯? ???₯
		for(int i=0; i<arr.length; i++) {
			if(i==6) {
				continue;
			}
			if(max<arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		
		//arr[6]? κ°μ ?¬?©?΄ μ΅μ ?? ?Έ?Έ?λ₯? κ΅¬ν¨
		int n = arr[6];
		if(n%2!=0) {
			n = n/2+1;
		}else {
			n/=2;
		}
		
		//? μ΅μ ?? ?Έ?Έμ€? μ΅λ?κ°μ κ΅¬ν΄ μΆλ ₯
		System.out.print(Math.max(arr[idx], n));
		
		
	}
}
