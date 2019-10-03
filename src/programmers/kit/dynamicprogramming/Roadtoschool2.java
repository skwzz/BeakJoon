package programmers.kit.dynamicprogramming;

import java.util.LinkedList;
import java.util.Queue;

public class Roadtoschool2 {
	static int[][] arr;
	static int[] nY = {-1, 0, 1, 0};
	static int[] nX = {0, -1, 0, 1};
	public static void main(String[] args) {
		int width = 4;
		int height = 3;
		
		int[][] pud = new int[][] {{2, 2}};
		
		arr = new int[height][width];
		
		for(int i=0; i<arr.length; i++) {
			arr[i][0] = 1;
		}
		for(int i=0; i<arr[0].length; i++) {
			arr[0][i] = 1;
		}
		for(int i=0; i<pud.length; i++	) {
			arr[pud[i][1]-1][pud[i][0]-1] = -1;
		}
		
		for(int i=1; i<arr.length; i++) {
			for(int j=1; j<arr[0].length; j++) {
				if(arr[i][j] == 0) {
					int tempV = 0;
					for(int k=0; k<4; k++) {
						int tempHeight = i + nY[k];
						int tempWidth = j + nX[k];
						if(tempHeight>=0 && tempWidth>=0 && tempHeight<arr.length && tempWidth<arr[0].length) {
							System.out.println(tempHeight +" "+tempWidth);
							if(arr[tempHeight][tempWidth]!=-1 && arr[tempHeight][tempWidth]!=0 ) {
								tempV += arr[tempHeight][tempWidth];
							}
						}
					}
					arr[i][j] = tempV;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
