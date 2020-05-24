package baekjoon;
import java.util.Scanner;
 
public class Q1932 {
 
    static int[][] arr;
 
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        arr = new int[num+1][num+1];
        int sum = 0;
        for(int i=1; i<arr.length; i++) {
        	for(int j=1; j<=i; j++) {
        		arr[i][j] = in.nextInt();
        		
        		if(j==1) {
        			arr[i][j] += arr[i-1][j];
        		}else if(j==i) {
        			arr[i][j] += arr[i-1][j-1];
        		}else {
        			arr[i][j] += Math.max(arr[i-1][j-1], arr[i-1][j]);
        		}
        		if(arr[i][j]>sum) {
        			sum = arr[i][j];
        		}
        	}
        }
        
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<arr[0].length; j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println("");
        }
        System.out.println(sum);
 
    }
 
}

