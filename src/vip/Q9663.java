package vip;
import java.util.Scanner;

public class Q9663 {
	static int[] arr;
    static int answer;
    static int num;
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	num = sc.nextInt();
    	arr=new int[num];
    	findnumQ(arr, num, 0);
    	System.out.println(answer);
    }
    
    static boolean promising(int[] arr,int num,int row) {
        for(int i=0; i<row; i++) {
            if(arr[row] == arr[i] || row-i == Math.abs(arr[row]-arr[i])) {
                return false;
            }
        }
        return true;
    }
    static void findnumQ(int[] arr,int num,int row) {
         for(int i=0;i<num;i++) {
             arr[row]=i;
             if(promising(arr, num, row)) {
                 if(row==num-1) {
                	 answer++;
                 }else {
                	 findnumQ(arr, num, row+1);
                 }
             }
         }
    }
}
