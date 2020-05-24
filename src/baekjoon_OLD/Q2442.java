package baekjoon_OLD;
import java.util.Scanner;

public class Q2442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][2*n-1];
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*(i+1)-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}	
