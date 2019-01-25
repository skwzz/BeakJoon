package success;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1012 {
	static int[] nX = {-1, 0, 1, 0};
	static int[] nY = {0, -1, 0, 1};
	static int[][] checker;
	public static void main(String[] args) throws IOException{
		Q1012 t = new Q1012();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int loopCnt = Integer.parseInt(st.nextToken());
		int width;
		int height;
		int baechu;
		int[][] arr;
		
		for(int k=0; k<loopCnt; k++) {
			st = new StringTokenizer(br.readLine());
			width = Integer.parseInt(st.nextToken());
			height = Integer.parseInt(st.nextToken());
			baechu = Integer.parseInt(st.nextToken());
			
			arr = new int[height][width];
			checker = new int[height][width];
			int x;
			int y;
			
			for(int i=0; i<baechu; i++	) {
				st = new StringTokenizer(br.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				
				arr[y][x] = 1;
			}
			
			int answer = 0;
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					
					if(arr[i][j]==1 && checker[i][j]==0) {
						checker[i][j]=1;
						t.baechuDFS(arr, i, j);
						answer++;
					}
					
				}
			}
			System.out.println(answer);
		}
	}
	
	public void baechuDFS(int[][] arr, int x, int y) {
		int nextX = 0;
		int nextY = 0;
		for(int i=0; i<4; i++) {
			nextX = x + nX[i];
			nextY = y + nY[i];
			if(nextX<0 || nextY<0 || nextX>=arr.length || nextY>=arr[0].length) {
				continue;
			}
			
			if(arr[nextX][nextY]==1 && checker[nextX][nextY]==0) {
				checker[nextX][nextY] = 1;
				baechuDFS(arr, nextX, nextY);
			}
		}
	}
}
