import java.util.Arrays;
import java.util.Scanner;

public class Q2309 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr);
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			if(sum>100) {
				break;
			}
			System.out.println(arr[i]);
		}
	}
}
