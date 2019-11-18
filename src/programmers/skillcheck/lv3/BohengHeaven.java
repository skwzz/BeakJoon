package programmers.skillcheck.lv3;

public class BohengHeaven {
	final static int MOD = 20170805;
	static int[][] dp;
	static int[][] dp2;
	public static void main(String[] args) {
		int m = 3;
		int n = 6;
		int[][] arr = new int[][] {{0, 2, 0, 0, 0, 2}, {0, 0, 2, 0, 1, 0}, {1, 0, 0, 2, 2, 0}};
		dp = new int[m+1][n+1];
		dp2 = new int[m+1][n+1];
		dp[1][1] = 1;
		dp2[1][1] = 1;
		getPath(arr);
		
		for(int i=1; i<dp.length; i++) {
			for(int j=1; j<dp[0].length; j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for(int i=1; i<dp2.length; i++) {
			for(int j=1; j<dp2[0].length; j++) {
				System.out.print(dp2[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		
	}
	
	static void getPath(int[][] arr) {
		for(int i=1; i<arr.length; i++) {
			for(int j=1; j<arr[0].length; j++) {
				if(arr[i-1][j-1]==0) {
					dp[i][j] = (dp[i][j] + dp[i][j-1] + dp2[i-1][j])%MOD;
					dp2[i][j] = (dp2[i][j] + dp[i][j-1] + dp2[i-1][j])%MOD;
				}else if(arr[i-1][j-1]==1) {
					dp[i][j] = 0;
					dp2[i][j] = 0;
				}else {
					dp[i][j] = dp[i][j-1];
					dp2[i][j] = dp[i-1][j];
				}
			}
		}
	}
}
