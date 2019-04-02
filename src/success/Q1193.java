package success;
import java.util.Scanner;

public class Q1193 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		int m = 0;
		int k = 0;
		for(int i=1; i<=num; i++) {
			m+=i;
			
			if(m>=num) {
				k=m-i;
				m=i;
				break;
			}
		}
		
		int[] arr = new int[2];
		if(m%2!=0) {
			arr[0]=m;
			arr[1]=1;
		}else {
			arr[0]=1;
			arr[1]=m;
		}
		int loopCnt = num - k;
		for(int i=1; i<loopCnt; i++) {
			if(m%2!=0) {
				arr[0]--;
				arr[1]++;
			}else {
				arr[0]++;
				arr[1]--;
			}
		}
		System.out.println(arr[0]+"/"+arr[1]);
	}
}
