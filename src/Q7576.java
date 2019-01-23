

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 * 토마토
 * @author kiwoong
 *
 */
public class Q7576 {
	static int col;
	static int row;
	static int[][] arr;
	static boolean[][] visited;
	static int[] nextX = {-1, 0, 1, 0};
	static int[] nextY = {0, -1, 0, 1};
	static int point;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		col = Integer.parseInt(st.nextToken());
		row = Integer.parseInt(st.nextToken());
		int startX=0;
		int startY=0;
		
		arr = new int[row][col];
		visited = new boolean[row][col];
		
		for(int i=0; i<row; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<col; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j]==1) {
					startX = i;
					startY = j;
				}
			}
		}
		visited[startX][startY] = true;
		BFSTomato(startX, startY);
		
		if(HasZero(arr)) {
			System.out.println(-1);
		}else {
			System.out.println(point-1);
		}
	}
	
	static void BFSTomato(int x, int y) {
		ArrayList<Dot> al = new ArrayList<Dot>();
		al.add(new Dot(x, y));
		
		while(al.size()!=0) {
			Dot d = al.remove(0);
			
			for(int i=0; i<4; i++) {
				int nX = d.x + nextX[i];
				int nY = d.y + nextY[i];
				
				if(nX<0 || nY<0 || nX>=row || nY>=col) {
					continue;
				}
				if(visited[nX][nY]==true || arr[nX][nY]!=0) {
					continue;
				}
				
				arr[nX][nY] = arr[d.x][d.y] + 1;
				point = arr[nX][nY];
				visited[nX][nY] = true;
				al.add(new Dot(nX, nY));
			}
		}
	}
	
	static boolean HasZero(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]==0) {
					return true;
				}
			}
		}
		return false;
	}
}
class Dot{
	int x;
	int y;
	public Dot(int x, int y) {
		this.x = x;
		this.y = y;
	}
}