package success;
import java.util.Scanner;

public class Q10870 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] arr = new int[n+1];
		
		arr[0] = 0;
		if(n>=1) {
			arr[1] = 1;
		}
		
		for(int i=2; i<=n; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		System.out.print(arr[n]);
	}
}
