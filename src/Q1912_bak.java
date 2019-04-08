import java.io.IOException;
import java.util.Scanner;

public class Q1912_bak {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		int[][] arr = new int[num][num];
		int max = -1001;
		for(int i=0; i<num; i++	) {
			arr[0][i] = in.nextInt();
			if(arr[0][i]>max) {
				max = arr[0][i];
			}
		}
		
		for(int i=1; i<num; i++) {
			for(int j=0; j<num-i; j++) {
				arr[i][j] = arr[i-1][j] + arr[0][j+i];
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		/*
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("=========");
		*/
		System.out.print(max);
	}
}
