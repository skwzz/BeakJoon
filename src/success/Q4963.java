package success;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q4963 {
	public static int[] nX = {-1, 0, 1, -1, 1, -1, 0, 1};
	public static int[] nY = {-1, -1, -1, 0, 0, 1, 1, 1};
	
	public static void main(String[] args) throws IOException{
		Q4963 to = new Q4963();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int w;
		int h;
		int[][] arr;
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if(w==0 && h==0) {
				break;
			}
			
			arr = new int[h][w];
			
			for(int i=0; i<arr.length; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<arr[0].length; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int count = 0;
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					if(arr[i][j]==1) {
						count++;
						to.getIsland(arr, new Dot4963(i, j));
					}
				}
			}
			System.out.println(count);
			count=0;
		}
	}
	
	public void getIsland(int[][] arr, Dot4963 Dot4963) {
		Queue<Dot4963> q = new LinkedList<Dot4963>();
		q.add(Dot4963);
		arr[Dot4963.x][Dot4963.y] = 0;
		
		int curX;
		int curY;
		int nextX;
		int nextY;
		Dot4963 d;
		
		while(!q.isEmpty()) {
			d = q.poll();
			curX = d.x;
			curY = d.y;
			
			for(int i=0; i<8; i++) {
				nextX = curX+nX[i];
				nextY = curY+nY[i];
				
				if(nextX<0 || nextY<0 || nextX>=arr.length ||nextY>=arr[0].length) {
					continue;
				}
				if(arr[nextX][nextY]==1) {
					arr[nextX][nextY]=0;
					q.add(new Dot4963(nextX, nextY));
				}
			}
		}
		
	}
}
class Dot4963{
	int x;
	int y;
	
	public Dot4963(int x, int y) {
		this.x = x;
		this.y = y;
	}
}