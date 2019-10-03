package programmers.kit.dynamicprogramming;

public class Triangle {
	static int[][] dp;
	static int[][] arr;
	public static void main(String[] args) {
		arr = new int[][]{{7}
		      ,{3, 8}
		      ,{8, 1, 0}
		      ,{2, 7, 4, 4}
		      ,{4, 5, 2, 6, 5}};
		
		dp = new int[arr.length][arr[arr.length-1].length];

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				dp[i][j] = arr[i][j];
			}
		}
		
		int max = dp[0][0];
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i==1) {
					dp[i][j] = dp[i][j]+arr[i-1][0];
				}else {
					if(j==0) {
						dp[i][j] = dp[i][j]+dp[i-1][0];
					}else if(j==arr[i].length-1) {
						dp[i][j] = dp[i][j]+dp[i-1][j-1];
					}else {
						dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j])+dp[i][j];
					}
				}
				
				if(max<dp[i][j]) {
					max = dp[i][j];
				}
			}
		}
		
		
		
	}
}
